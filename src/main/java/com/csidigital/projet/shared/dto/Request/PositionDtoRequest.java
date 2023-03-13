package com.csidigital.projet.shared.dto.Request;

import com.csidigital.projet.shared.enumeration.PositionName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PositionDtoRequest {
    private Integer level;
    private String name;
    private PositionName positionName;
}
