package com.authorzelalem.managmentsystem.repositories;

import com.authorzelalem.managmentsystem.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepositories extends CrudRepository <Order, Long> {
}
