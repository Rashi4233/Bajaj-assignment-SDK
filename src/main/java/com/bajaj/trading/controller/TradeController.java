package com.bajaj.trading.controller;

import com.bajaj.trading.repository.TradeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/trades")
public class TradeController {

    @GetMapping
    public Object getAllTrades() {
        return TradeRepository.findAll();
    }
}
