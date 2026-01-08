package com.bajaj.trading.repository;

import com.bajaj.trading.model.Order;

import java.util.HashMap;
import java.util.Map;

public class OrderRepository {

    private static final Map<String, Order> orders = new HashMap<>();

    public static void save(Order order) {
        orders.put(order.getOrderId(), order);
    }

    public static Order findById(String orderId) {
        return orders.get(orderId);
    }
}
