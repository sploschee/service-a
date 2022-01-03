package com.splosch.servicea.controller;

import com.splosch.servicea.model.SpotPrice;
import com.splosch.servicea.service.BitcoinPricingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.spring5.context.webflux.IReactiveDataDriverContextVariable;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;

import reactor.core.publisher.Mono;

@Controller
public class BitcoinPricingController {

    @Autowired
    private BitcoinPricingService bitcoinPricingService;

    @GetMapping("/")
    public String spotPrice(
            @RequestParam(name = "currency", required = false, defaultValue = "USD") String currency, Model model) {
        Mono<SpotPrice> spotPriceMono = bitcoinPricingService.getSpotPrice(currency);
        IReactiveDataDriverContextVariable spotPrice = new ReactiveDataDriverContextVariable(spotPriceMono.flux(), 1);
        model.addAttribute("prices", spotPrice);
        return "index";
    }
}
