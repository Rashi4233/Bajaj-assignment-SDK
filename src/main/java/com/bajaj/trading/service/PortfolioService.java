package com.bajaj.trading.service;

import com.bajaj.trading.model.PortfolioHolding;
import com.bajaj.trading.model.Trade;
import com.bajaj.trading.repository.TradeRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PortfolioService {

    public List<PortfolioHolding> getPortfolio() {

        Map<String, List<Trade>> tradesBySymbol = new HashMap<>();

        for (Trade trade : TradeRepository.findAll()) {
            tradesBySymbol
                    .computeIfAbsent(trade.getSymbol(), k -> new ArrayList<>())
                    .add(trade);
        }

        List<PortfolioHolding> portfolio = new ArrayList<>();

        for (Map.Entry<String, List<Trade>> entry : tradesBySymbol.entrySet()) {

            String symbol = entry.getKey();
            List<Trade> trades = entry.getValue();

            int totalQuantity = 0;
            double totalValue = 0;

            for (Trade trade : trades) {
                totalQuantity += trade.getQuantity();
                totalValue += trade.getQuantity() * trade.getPrice();
            }

            double averagePrice = totalValue / totalQuantity;
            double currentValue = totalValue; // simplified assumption

            portfolio.add(new PortfolioHolding(
                    symbol,
                    totalQuantity,
                    averagePrice,
                    currentValue
            ));
        }

        return portfolio;
    }
}
