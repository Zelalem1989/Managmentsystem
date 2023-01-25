package com.authorzelalem.managmentsystem.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name= "Products")
public class Products extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "Order_Id")
    private Order orders;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "product_materials", joinColumns = @JoinColumn(name= "product_id"),
            inverseJoinColumns = @JoinColumn(name = "material_Id"))
    private Set<Materials> materialsSet = new HashSet<>();
    @Column(name= "product_Id")
    private long productId;
    @Column(name= "product_Name")
    private String productName;
    @Column(name= "category_Id")
    private String categoryId;
}
