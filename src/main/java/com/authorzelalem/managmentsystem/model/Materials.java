package com.authorzelalem.managmentsystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Materials")
public class Materials extends BaseEntity{
    @Column(name = "Material_Name")
    private String materialName;
}
