package com.cproject.quote_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cproject.quote_api.model.Quote;

public interface QuoteRepository extends JpaRepository<Quote, Long> {
}
