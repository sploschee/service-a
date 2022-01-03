package com.splosch.servicea.controller;

import com.splosch.servicea.service.BitcoinPricingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BitcoinPricingController {

    @Autowired
    private BitcoinPricingService bitcoinPricingService;

    @GetMapping("/spotprice")
    public String spotPrice(
            @RequestParam(name = "currency", required = false, defaultValue = "USD") String currency, Model model) {
        bitcoinPricingService.getSpotPrice(currency);
        model.addAttribute("currency", currency);
        return "spotprice";
    }
}
