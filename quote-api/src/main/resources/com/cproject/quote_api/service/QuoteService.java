package com.cproject.quote_api.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cproject.quote_api.model.Quote;
import com.cproject.quote_api.repository.QuoteRepository;

@Service
public class QuoteService {
    private final QuoteRepository quoteRepository;

    @Autowired
    public QuoteService(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    public Quote getRandomQuote() {
        List<Quote> quotes = quoteRepository.findAll();
        Random rand = new Random();
        return quotes.get(rand.nextInt(quotes.size()));
    }
}
