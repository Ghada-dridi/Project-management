package com.csidigital.projet.management.service;

import com.csidigital.projet.shared.dto.Request.ClientReviewDtoRequest;
import com.csidigital.projet.shared.dto.Request.PositionDtoRequest;
import com.csidigital.projet.shared.dto.Request.TaskDtoRequest;
import com.csidigital.projet.shared.dto.Response.ClientReviewDtoResponse;
import com.csidigital.projet.shared.dto.Response.PositionDtoResponse;
import com.csidigital.projet.shared.dto.Response.TaskDtoResponse;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PositionService {
    // Get All positions
    List<PositionDtoResponse> getAllPosition();

    // Get  by position id
     PositionDtoResponse getPositionById(Long id);

    // Add new position
    PositionDtoResponse createPosition(PositionDtoRequest positionDtoRequest);


    // Update position by id

    PositionDtoResponse updatePosition(Long id,PositionDtoRequest positionDtoRequest);


    //delete position by id
    void deletePositionById(Long id);
}
