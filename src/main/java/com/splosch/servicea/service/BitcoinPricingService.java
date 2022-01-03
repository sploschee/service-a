package com.splosch.servicea.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import com.splosch.servicea.model.SpotPrice;
import reactor.core.publisher.Mono;
import static org.springframework.http.MediaType.APPLICATION_JSON;

/**
 * BitcoinPricingService
 */
@Service
public class BitcoinPricingService {

    private WebClient client = WebClient.create("https://api.coinbase.com/v2");

    public Mono<SpotPrice> getSpotPrice(String currencyCode) {
        return client.get()
                .uri("/prices/spot?currency={currencyCode}", currencyCode).accept(APPLICATION_JSON)
                .retrieve()
                .bodyToMono(SpotPrice.class);
    }

}