package com.bajaj.trading.repository;

import com.bajaj.trading.model.Trade;

import java.util.ArrayList;
import java.util.List;

public class TradeRepository {

    private static final List<Trade> trades = new ArrayList<>();

    public static void save(Trade trade) {
        trades.add(trade);
    }

    public static List<Trade> findAll() {
        return trades;
    }
}
