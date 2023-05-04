package com.csidigital.projet.management.controller;

import com.csidigital.projet.management.service.InternProjectService;
import com.csidigital.projet.management.service.ProjectService;
import com.csidigital.projet.shared.dto.Request.InternProjectDtoRequest;
import com.csidigital.projet.shared.dto.Request.ProjectDtoRequest;
import com.csidigital.projet.shared.dto.Response.InternProjectDtoResponse;
import com.csidigital.projet.shared.dto.Response.ProjectDtoResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/internProject")
@RestController
public class InternProjectController {
    private final InternProjectService internProjectService;
    @GetMapping("/getAll")
    public ResponseEntity<List<InternProjectDtoResponse>> getAllInterProjects() {
        return new ResponseEntity<>(internProjectService.getAllInternProjects(), HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<InternProjectDtoResponse> getInternProjectById(@PathVariable Long id) {
        return new ResponseEntity<>(internProjectService.getInternProjectById(id), HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<InternProjectDtoResponse> createInternProject(@Valid @RequestBody InternProjectDtoRequest internProjectDtoRequest) {
        return new ResponseEntity<>(internProjectService.createInternProject(internProjectDtoRequest), HttpStatus.OK);
    }

    @PutMapping("/updateById/{id}")
    public ResponseEntity<InternProjectDtoResponse> updateInternProject(@Valid @RequestBody InternProjectDtoRequest internProjectDtoRequest, @PathVariable Long id) {
        return new ResponseEntity<>(internProjectService.updateInternProject(id,internProjectDtoRequest), HttpStatus.OK);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteInternProject(@PathVariable Long id){
        internProjectService.deleteInternProjectById(id);

    }
}
