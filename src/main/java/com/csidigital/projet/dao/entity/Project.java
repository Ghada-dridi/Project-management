package com.csidigital.projet.dao.entity;

import com.csidigital.projet.shared.enumeration.ProjectStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorColumn(name = "type")//hadhi ta3 chnowa
@Data
@Entity
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String projectReference;
    private String name;
    private String description;
    private Double budget;
    private Date startDate;
    private Date endDate;

    @Enumerated(EnumType.STRING)
    private ProjectStatus projectStatus;


}

