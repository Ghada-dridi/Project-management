package com.csidigital.projet.management.service.impl;

import com.csidigital.projet.dao.entity.ClientReview;
import com.csidigital.projet.dao.entity.Position;
import com.csidigital.projet.dao.repository.PositionRepository;
import com.csidigital.projet.management.service.PositionService;
import com.csidigital.projet.shared.dto.Request.PositionDtoRequest;
import com.csidigital.projet.shared.dto.Response.ClientReviewDtoResponse;
import com.csidigital.projet.shared.dto.Response.PositionDtoResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    private ModelMapper modelmapper;

    @Autowired
    private PositionRepository postionRepository;

    @Override
    public List<PositionDtoResponse> getAllPosition() {

        List<Position> positions = postionRepository.findAll();
        List<PositionDtoResponse> positionList = new ArrayList<>();

        for (Position position : positions) {
            PositionDtoResponse positionDtoResponse = modelmapper.map(position,PositionDtoResponse.class);
            positionList.add(positionDtoResponse);
        }

        return positionList;
    }

    @Override
    public PositionDtoResponse getPositionById(Long id) {
        Position position = postionRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Position with id " +id+ " not found"));
        PositionDtoResponse positionDtoResponse = modelmapper.map(position, PositionDtoResponse.class);
        return positionDtoResponse;

    }

    @Override
    public PositionDtoResponse createPosition(PositionDtoRequest positionDtoRequest) {
        Position position = modelmapper.map(positionDtoRequest, Position.class);
        Position PositionSaved = postionRepository.save(position);
        return modelmapper.map(PositionSaved, PositionDtoResponse.class);
    }

    @Override
    public PositionDtoResponse updatePosition(Long id, PositionDtoRequest positionDtoRequest) {
        Position position = postionRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Position with id: " + id + " not found"));
        modelmapper.map(positionDtoRequest, position);
        Position updatedPosition = postionRepository.save(position);
        return modelmapper.map(updatedPosition, PositionDtoResponse.class);
    }

    @Override
    public void deletePositionById(Long id) {
        postionRepository.deleteById(id);

    }
}
