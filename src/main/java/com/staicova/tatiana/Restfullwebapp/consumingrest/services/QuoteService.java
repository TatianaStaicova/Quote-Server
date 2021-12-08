package com.staicova.tatiana.Restfullwebapp.consumingrest.services;

import com.staicova.tatiana.Restfullwebapp.consumingrest.models.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteService {

    private static Logger logger = LoggerFactory.getLogger(QuoteService.class);

    public Quote getQuoteFromApi(){
        RestTemplate restTemplate = new RestTemplate();
    Quote quote = restTemplate.getForObject("https://quoters.apps.pcfone.io/api/random", "",);
    return quote;
    }
}
