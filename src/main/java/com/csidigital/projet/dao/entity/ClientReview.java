package com.csidigital.projet.dao.entity;

import com.csidigital.projet.shared.enumeration.ReviewType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="client_review")
@Entity
public class ClientReview implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateReview;
    private String subject;
    private String comment;
    private Integer satisfaction;

    @Enumerated(EnumType.STRING)
    private ReviewType reviewtype;


}
