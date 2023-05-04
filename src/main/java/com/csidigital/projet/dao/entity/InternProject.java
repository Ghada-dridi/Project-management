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
@NoArgsConstructor
@Entity
@DiscriminatorValue("Intern")
public class InternProject extends Project{

    @OneToMany(mappedBy = "internProject", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Timesheet> timesheets ;


}
