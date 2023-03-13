package com.csidigital.projet.dao.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@DiscriminatorValue("Extern")
@NoArgsConstructor
@Entity
public class ExternProject extends Project{
    private  String responsable;
    private  Double realCost;
}
