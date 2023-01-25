package com.authorzelalem.managmentsystem.service.SDJpa;

import com.authorzelalem.managmentsystem.model.Order;
import com.authorzelalem.managmentsystem.repositories.OrderRepositories;
import com.authorzelalem.managmentsystem.repositories.ProductsRepositories;
import com.authorzelalem.managmentsystem.repositories.MaterialsRepositories;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import com.authorzelalem.managmentsystem.service.OrderService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OrderSDJpaService implements OrderService{

     private final OrderRepositories orderRepositories;
     private final ProductsRepositories productsRepositories;
     private final MaterialsRepositories materialsRepositories;


    public OrderSDJpaService(OrderRepositories orderRepositories, ProductsRepositories productsRepositories,
                             MaterialsRepositories materialsRepositories) {
        this.orderRepositories = orderRepositories;
        this.productsRepositories = productsRepositories;
        this.materialsRepositories = materialsRepositories;
    }

    @Override
    public Set<Order> findAll() {
       Set<Order> orders = new HashSet<>();
       orderRepositories.findAll().forEach(orders::add);
       return orders;
    }

    @Override
    public Order findById(Long aLong) {
        return orderRepositories.findById(aLong).orElse(null);
    }

    @Override
    public Order save(Order object) {
        return orderRepositories.save(object);
    }

    @Override
    public void delete(Order object) {
        orderRepositories.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        orderRepositories.deleteById(aLong);
    }
}