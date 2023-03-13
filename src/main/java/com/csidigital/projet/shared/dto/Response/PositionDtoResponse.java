package com.csidigital.projet.shared.dto.Response;

import com.csidigital.projet.shared.enumeration.PositionName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PositionDtoResponse {
    private Long id ;
    private Integer level;
    private String name;
    private PositionName positionName;
}
