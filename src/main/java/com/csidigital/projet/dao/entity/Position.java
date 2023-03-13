package com.csidigital.projet.dao.entity;

import com.csidigital.projet.shared.enumeration.PositionName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="position")
@Entity
public class Position implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer level;
    private String name;
    @Enumerated(EnumType.STRING)
    private PositionName positionName;
}
