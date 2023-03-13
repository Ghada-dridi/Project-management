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
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/positions")
public class PositionController {
    private final PositionService positionService;

    @GetMapping("/getAll")
    public List<PositionDtoResponse> getAllPosition() {
        return positionService.getAllPosition();
    }

    @GetMapping("/getById/{id}")
    public PositionDtoResponse getPositionById(@PathVariable Long id){
        return positionService.getPositionById(id);
    }

    @PostMapping("/addPosition")
    public PositionDtoResponse createPosition(@Valid @RequestBody PositionDtoRequest positionDtoRequest){
        return positionService.createPosition(positionDtoRequest);
    }

    @PutMapping("/updatePosition/{id}")
    public PositionDtoResponse updatePosition(@PathVariable Long id,@Valid @RequestBody  PositionDtoRequest positionDtoRequest){
        return positionService.updatePosition(id,positionDtoRequest);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePosition(@PathVariable Long id){

        positionService.deletePositionById(id);
    }




}
