package com.csidigital.projet.management.controller;

import com.csidigital.projet.management.service.PositioningService;
import com.csidigital.projet.shared.dto.Request.PositionDtoRequest;
import com.csidigital.projet.shared.dto.Request.PositioningDtoRequest;
import com.csidigital.projet.shared.dto.Request.TaskDtoRequest;
import com.csidigital.projet.shared.dto.Response.PositionDtoResponse;
import com.csidigital.projet.shared.dto.Response.PositioningDtoResponse;
import com.csidigital.projet.shared.dto.Response.TaskDtoResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/positioning")
public class PositioningController {
    private final PositioningService positioningService;

    @GetMapping("/getAll")
    public ResponseEntity<List<PositioningDtoResponse>> getAllPositioning() {
        return new ResponseEntity<>(positioningService.getAllPositioning(), HttpStatus.OK);
    }
    @GetMapping("/getById/{id}")
    public ResponseEntity<PositioningDtoResponse> getTaskById(@PathVariable Long id) {
        return new ResponseEntity<>(positioningService.getPositioningById(id), HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<PositioningDtoResponse> createPositioning(@Valid @RequestBody PositioningDtoRequest positioningDtoRequest) {
        return new ResponseEntity<>(positioningService.createPositioning(positioningDtoRequest), HttpStatus.OK);
    }

    @PutMapping("/updateById/{id}")
    public ResponseEntity<PositioningDtoResponse> updatePositioning(@Valid @RequestBody PositioningDtoRequest positioningDtoRequest, @PathVariable Long id) {
        return new ResponseEntity<>(positioningService.updatePositioning(id,positioningDtoRequest), HttpStatus.OK);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteTask(@PathVariable Long id){
        positioningService.deletePositioningById(id);

    }
}
