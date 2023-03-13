package com.csidigital.projet.shared.dto.Request;

import com.csidigital.projet.shared.enumeration.PositioningStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PositioningDtoRequest {
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

    private PositioningStatus positioningStatus;
}
