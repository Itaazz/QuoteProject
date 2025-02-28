package com.cproject.quote_api.service;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.cproject.quote_api.model.Quote;
import com.cproject.quote_api.repository.QuoteRepository;

@Service
public class QuoteService {
    private final QuoteRepository repository;
    
    public QuoteService(QuoteRepository repository) {
        this.repository = repository;
    }

    public Quote getRandomQuote() {
        List<Quote> quotes = repository.findAll();
        return quotes.get(new Random().nextInt(quotes.size()));
    }
}
