package com.linkedin.fullapplinkedinakka.service;

import com.linkedin.fullapplinkedinakka.model.CoinBaseResponse;
import reactor.core.publisher.Mono;

public interface CoinbaseService {

    Mono<CoinBaseResponse> getCryptoPrice(String priceName);
}
