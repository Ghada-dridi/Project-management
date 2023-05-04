package com.csidigital.projet.management.service.impl;

import com.csidigital.projet.dao.entity.ExternProject;
import com.csidigital.projet.dao.entity.Positioning;
import com.csidigital.projet.dao.entity.Task;
import com.csidigital.projet.dao.repository.ExternProjectRepository;
import com.csidigital.projet.dao.repository.PositioningRepository;
import com.csidigital.projet.management.service.PositioningService;
import com.csidigital.projet.shared.dto.Request.PositioningDtoRequest;
import com.csidigital.projet.shared.dto.Response.PositioningDtoResponse;
import com.csidigital.projet.shared.dto.Response.TaskDtoResponse;
import org.modelmapper.ModelMapper;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PositioningServiceImpl implements PositioningService {
    private PositioningRepository positioningRepository;
     private ExternProjectRepository externProjectRepository;
    private ModelMapper modelMapper;
    @Override
    public List<PositioningDtoResponse> getAllPositioning() {
        List<Positioning> positionings = positioningRepository.findAll();
        List<PositioningDtoResponse> positioningList = new ArrayList<>();

        for (Positioning positioning : positionings) {
            PositioningDtoResponse positioningDtoResponse = modelMapper.map(positioning,PositioningDtoResponse.class);
            positioningList.add(positioningDtoResponse);
        }

        return positioningList;
    }



    @Override
    public PositioningDtoResponse getPositioningById(Long id) {
        Positioning positioning = positioningRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Positioning with id " +id+ " not found"));
        PositioningDtoResponse positioningDtoResponse = modelMapper.map(positioning, PositioningDtoResponse.class);
        return positioningDtoResponse;

    }

    @Override
    public PositioningDtoResponse createPositioning(PositioningDtoRequest positioningDtoRequest) {


        Positioning positioning = modelMapper.map(positioningDtoRequest, Positioning.class);
        Positioning PositioningSaved = positioningRepository.save(positioning);
        return modelMapper.map(PositioningSaved, PositioningDtoResponse.class);
    }

    @Override
    public PositioningDtoResponse updatePositioning(Long id, PositioningDtoRequest positioningDtoRequest) {
        Positioning positioning = positioningRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Positioning with id: " + id + " not found"));
        modelMapper.map(positioningDtoRequest, positioning);
        Positioning updatedPositioning = positioningRepository.save(positioning);
        return modelMapper.map(updatedPositioning, PositioningDtoResponse.class);
    }

    @Override
    public void deletePositioningById(Long id) {
        positioningRepository.deleteById(id);

    }
}
