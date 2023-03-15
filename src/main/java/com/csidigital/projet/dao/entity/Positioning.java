package com.csidigital.projet.dao.entity;

import com.csidigital.projet.shared.enumeration.PositioningStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Positioning implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date startDate;
    private Date endDate;
    private Integer finalNumberCondidatPosisioned;
    private Long numberDaySold;
    private Long dailySalePrice;
    private Long occupancyRate;
    private Long avregeDailyCost;
    private Long revenue;
    private Long cost;
    private Long margin;
    private Long profitability;
    private String comment;

    @Enumerated(EnumType.STRING)
    private PositioningStatus positioningStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ExternProject_id")
    private ExternProject externProject;
}
