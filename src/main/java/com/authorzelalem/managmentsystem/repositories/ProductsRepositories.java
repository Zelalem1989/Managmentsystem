package com.authorzelalem.managmentsystem.repositories;

import com.authorzelalem.managmentsystem.model.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductsRepositories extends CrudRepository <Products, Long> {
}
