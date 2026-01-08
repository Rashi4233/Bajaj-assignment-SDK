package com.bajaj.trading.service;

import com.bajaj.trading.dto.OrderRequest;
import com.bajaj.trading.model.Order;
import com.bajaj.trading.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public Order placeOrder(OrderRequest request) {

        // Basic validations
        if (request.getQuantity() <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0");
        }

        if ("LIMIT".equalsIgnoreCase(request.getType()) && request.getPrice() == null) {
            throw new IllegalArgumentException("Price is required for LIMIT orders");
        }

        // Create order
        Order order = new Order(
                request.getSymbol(),
                request.getSide(),
                request.getType(),
                request.getQuantity(),
                request.getPrice()
        );

        // Simulate execution
        if ("MARKET".equalsIgnoreCase(order.getType())) {
            order.setStatus("EXECUTED");
        }

        // Save order
        OrderRepository.save(order);

        return order;
    }

    public Order getOrderById(String orderId) {
        return OrderRepository.findById(orderId);
    }
}
