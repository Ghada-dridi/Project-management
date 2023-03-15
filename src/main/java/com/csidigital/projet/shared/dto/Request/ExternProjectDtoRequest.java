package com.csidigital.projet.shared.dto.Request;

import com.csidigital.projet.shared.enumeration.ProjectStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExternProjectDtoRequest extends ProjectDtoRequest{

    private  String responsable;
    private  Double realCost;
}
