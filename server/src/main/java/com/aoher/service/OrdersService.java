package com.aoher.service;

import com.aoher.model.Order;

import java.util.List;

public interface OrdersService {

    String addNewProduct(Order order);

    List<Order> findByName(String name);

    List<Order> findAll();

    String update(Order order);

    String delete(int productId);
}