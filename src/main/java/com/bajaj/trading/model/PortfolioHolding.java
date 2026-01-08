package com.bajaj.trading.model;

public class PortfolioHolding {

    private String symbol;
    private int quantity;
    private double averagePrice;
    private double currentValue;

    public PortfolioHolding(String symbol, int quantity, double averagePrice, double currentValue) {
        this.symbol = symbol;
        this.quantity = quantity;
        this.averagePrice = averagePrice;
        this.currentValue = currentValue;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public double getCurrentValue() {
        return currentValue;
    }
}
