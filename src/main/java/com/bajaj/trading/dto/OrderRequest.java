package com.bajaj.trading.dto;

public class OrderRequest {

    private String symbol;
    private String side;     // BUY or SELL
    private String type;     // MARKET or LIMIT
    private int quantity;
    private Double price;    // required only for LIMIT orders

    public String getSymbol() {
        return symbol;
    }

    public String getSide() {
        return side;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }
}
