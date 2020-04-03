package com.aoher.service.impl;

import com.aoher.model.Order;
import com.aoher.repository.OrdersRepository;
import com.aoher.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.beans.BeanUtils.copyProperties;

@Service
public class OrderServiceImpl implements OrdersService {

    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public String addNewProduct(Order order) {
// TODO Auto-generated method stub
        ordersRepository.save(order);
        return order.getProductName();
    }

    @Override
    public List<Order> findByName(String name) {
// TODO Auto-generated method stub
        return ordersRepository.findByProductName(name);
    }

    @Override
    public List<Order> findAll() {
// TODO Auto-generated method stub
        return ordersRepository.findAll();
    }

    @Override
    public String update(Order order) {
// TODO Auto-generated method stub
        Order existingOrder = ordersRepository.findById(order.getProductId()).get();
        copyProperties(order, existingOrder);
        ordersRepository.save(existingOrder);
        return existingOrder.getProductName();
    }

    @Override
    public String delete(int productId) {

        Order existingOrder = ordersRepository.findById(productId).get();
        ordersRepository.delete(existingOrder);
        return existingOrder.getProductName() + " deleted ";
    }
}
