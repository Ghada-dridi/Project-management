package com.csidigital.projet.dao.entity;


import com.csidigital.projet.shared.enumeration.Priority;
import com.csidigital.projet.shared.enumeration.TaskPhase;
import com.csidigital.projet.shared.enumeration.TaskType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Task implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Date startDate;
    private Long estimation;
    private String reference;
    private TaskType taskType;
    private Priority priority;
    @Enumerated(EnumType.STRING)
    private TaskPhase taskPhase;
}
