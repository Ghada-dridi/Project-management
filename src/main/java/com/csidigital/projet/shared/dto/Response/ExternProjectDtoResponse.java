package com.csidigital.projet.shared.dto.Response;

import com.csidigital.projet.shared.enumeration.ProjectStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExternProjectDtoResponse {
    private Long id;
    private String projectReference;
    private String name;
    private String description;
    private Double budget;
    private Date startDate;
    private Date endDate;


    private ProjectStatus projectStatus;

    private  String responsable;
    private  Double realCost;
}
