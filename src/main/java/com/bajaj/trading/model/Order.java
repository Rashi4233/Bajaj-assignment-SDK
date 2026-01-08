package com.bajaj.trading.model;

import java.util.UUID;

public class Order {

    private String orderId;
    private String symbol;
    private String side;   // BUY or SELL
    private String type;   // MARKET or LIMIT
    private int quantity;
    private Double price;
    private String status; // NEW, PLACED, EXECUTED, CANCELLED

    public Order(String symbol, String side, String type, int quantity, Double price) {
        this.orderId = UUID.randomUUID().toString();
        this.symbol = symbol;
        this.side = side;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.status = "PLACED";
    }

    public String getOrderId() {
        return orderId;
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
