package com.authorzelalem.managmentsystem.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;
@Data
@Entity
@Table(name= "Purchase_Order")
public class Order extends BaseEntity{
    @ManyToOne
    private Customer customers;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Products> product = new HashSet<>();
    @Column(name= "Material")
    private String material;
    @Column(name= "Quantity")
    private String quantity;

}
