package com.splosch.servicea.controller;

import java.time.Duration;

import com.splosch.servicea.model.SpotPrice;
import com.splosch.servicea.service.BitcoinPricingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
public class BitcoinPricingController {

    @Autowired
    private BitcoinPricingService bitcoinPricingService;

    @GetMapping(value = "/spotprices", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseBody
    Flux<SpotPrice> getSpotPrice(
            @RequestParam(name = "currency", required = false, defaultValue = "USD") String currency) {
        return bitcoinPricingService.getSpotPrice(currency).delayElements(Duration.ofSeconds(60));

    }

    @GetMapping("/")
    Mono<String> home() {
        return Mono.just("index");
    }
}
