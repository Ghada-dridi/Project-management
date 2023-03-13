package com.csidigital.projet.management.service;

import com.csidigital.projet.shared.dto.Request.PositioningDtoRequest;
import com.csidigital.projet.shared.dto.Request.TaskDtoRequest;
import com.csidigital.projet.shared.dto.Response.PositioningDtoResponse;
import com.csidigital.projet.shared.dto.Response.TaskDtoResponse;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PositioningService {
    // Get All positioning
    List<PositioningDtoResponse> getAllPositioning();

    // Get positioning by id
    PositioningDtoResponse getPositioningById(Long id);

    // Add new positioning
    PositioningDtoResponse createPositioning(PositioningDtoRequest positioningDtoRequest);


    // Update positioning by id

    PositioningDtoResponse updatePositioning(Long id,PositioningDtoRequest positioningDtoRequest);


    //delete positioning by id
    void deletePositioningById(Long id);
}
