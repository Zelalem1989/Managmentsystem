package com.authorzelalem.managmentsystem.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Data
@Entity
@Table (name = "Customers")
public class Customer extends BaseEntity{
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "order_Id")
    private Set<Order> orders;
    @Column(name= "FirstName")
    private String customerFirstName;
    @Column(name= "LastName")
    private String customerLastName;
    @Column(name= "Email")
    private String email;
    @Column(name= "TIN Number")
    private Long tinNumber;
    @Column(name= "PhoneNumber")
    private Long phoneNumber;
}
