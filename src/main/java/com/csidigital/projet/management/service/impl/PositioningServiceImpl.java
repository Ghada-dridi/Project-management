package com.csidigital.projet.management.service.impl;

import com.csidigital.projet.management.service.PositioningService;
import com.csidigital.projet.shared.dto.Request.PositioningDtoRequest;
import com.csidigital.projet.shared.dto.Response.PositioningDtoResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PositioningServiceImpl implements PositioningService {
    @Override
    public List<PositioningDtoResponse> getAllPositioning() {
        return null;
    }

    @Override
    public PositioningDtoResponse getPositioningById(Long id) {
        return null;
    }

    @Override
    public PositioningDtoResponse createPositioning(PositioningDtoRequest positioningDtoRequest) {
        return null;
    }

    @Override
    public PositioningDtoResponse updatePositioning(Long id, PositioningDtoRequest positioningDtoRequest) {
        return null;
    }

    @Override
    public void deletePositioningById(Long id) {

    }
}
