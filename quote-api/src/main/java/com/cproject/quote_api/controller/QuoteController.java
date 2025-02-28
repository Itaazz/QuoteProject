package com.cproject.quote_api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cproject.quote_api.model.Quote;
import com.cproject.quote_api.service.QuoteService;

@RestController
@RequestMapping("/api/quotes")
public class QuoteController {
    private final QuoteService service;

    public QuoteController(QuoteService service) {
        this.service = service;
    }

    @GetMapping("/random")
    public ResponseEntity<Quote> getRandomQuote() {
        return ResponseEntity.ok(service.getRandomQuote());
    }
}