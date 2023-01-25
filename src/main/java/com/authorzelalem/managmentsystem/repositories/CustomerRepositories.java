package com.authorzelalem.managmentsystem.repositories;

import com.authorzelalem.managmentsystem.model.Customer;
import com.authorzelalem.managmentsystem.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepositories extends CrudRepository<Customer, Long> {

}
