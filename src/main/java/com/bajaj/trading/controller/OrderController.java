package com.bajaj.trading.controller;

import com.bajaj.trading.dto.OrderRequest;
import com.bajaj.trading.model.Order;
import com.bajaj.trading.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public Order placeOrder(@RequestBody OrderRequest request) {
        return orderService.placeOrder(request);
    }

    @GetMapping("/{orderId}")
    public Order getOrderStatus(@PathVariable String orderId) {
        return orderService.getOrderById(orderId);
    }
}
