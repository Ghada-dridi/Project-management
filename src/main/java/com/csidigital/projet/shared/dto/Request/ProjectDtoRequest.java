package com.csidigital.projet.shared.dto.Request;


import com.csidigital.projet.shared.enumeration.ProjectStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDtoRequest {
    private String projectReference;
    private String name;
    private String description;
    private Double budget;
    private Date startDate;
    private Date endDate;

    @Enumerated(EnumType.STRING)
    private ProjectStatus projectStatus;

}
