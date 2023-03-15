package com.csidigital.projet.dao.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@DiscriminatorValue("Extern")
@NoArgsConstructor
@Entity
public class ExternProject extends Project{
    private  String responsable;
    private  Double realCost;
    @OneToMany(mappedBy = "externProject", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Positioning> positionings = new ArrayList<>();

}
