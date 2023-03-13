package com.csidigital.projet.management.controller;

import com.csidigital.projet.management.service.PositionService;
import com.csidigital.projet.shared.dto.Request.ClientReviewDtoRequest;
import com.csidigital.projet.shared.dto.Request.PositionDtoRequest;
import com.csidigital.projet.shared.dto.Response.ClientReviewDtoResponse;
import com.csidigital.projet.shared.dto.Response.PositionDtoResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/position")
public class PositionController {
    @Autowired
    private final PositionService positionService;

    @GetMapping("/getAllPosition")
    public ResponseEntity<List<PositionDtoResponse>> getAllPosition() {
        return new ResponseEntity<>(positionService.getAllPosition(), HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<PositionDtoResponse> getPositionById(@PathVariable Long id) {
        return new ResponseEntity<>(positionService.getPositionById(id), HttpStatus.OK);
    }
    @PostMapping("/addPosition")
    public ResponseEntity<PositionDtoResponse> createPosition(@Valid @RequestBody PositionDtoRequest positionDtoRequest) {
        return new ResponseEntity<>(positionService.createPosition(positionDtoRequest), HttpStatus.OK);
    }

    @PutMapping("/updatePosition/{id}")
    public ResponseEntity<PositionDtoResponse> updatePosition(@Valid @RequestBody PositionDtoRequest positionDtoRequest, @PathVariable Long id) {
        return new ResponseEntity<>(positionService.updatePosition(id,positionDtoRequest), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePosition(@PathVariable Long id){
        positionService.deletePositionById(id);

    }




}
