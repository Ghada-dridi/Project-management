package com.csidigital.projet.management.controller;

import com.csidigital.projet.management.service.ExternProjectService;
import com.csidigital.projet.management.service.ProjectService;
import com.csidigital.projet.shared.dto.Request.ExternProjectDtoRequest;
import com.csidigital.projet.shared.dto.Request.ProjectDtoRequest;
import com.csidigital.projet.shared.dto.Response.ExternProjectDtoResponse;
import com.csidigital.projet.shared.dto.Response.ProjectDtoResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/externProject")
@RestController
public class ExternProjectController {
    private final ExternProjectService externProjectService;
    @GetMapping("/getAllProjects")
    public ResponseEntity<List<ExternProjectDtoResponse>> getAllExternProjects() {
        return new ResponseEntity<>(externProjectService.getAllExternProjects(), HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<ExternProjectDtoResponse> getExternProjectById(@PathVariable Long id) {
        return new ResponseEntity<>(externProjectService.getExternProjectById(id), HttpStatus.OK);
    }
    @PostMapping("/addExternProject")
    public ResponseEntity<ExternProjectDtoResponse> createExternProject(@Valid @RequestBody ExternProjectDtoRequest externProjectDtoRequest) {
        return new ResponseEntity<>(externProjectService.createExternProject(externProjectDtoRequest), HttpStatus.OK);
    }

    @PutMapping("/updateExternProject/{id}")
    public ResponseEntity<ExternProjectDtoResponse> updateExternProject(@Valid @RequestBody ExternProjectDtoRequest externProjectDtoRequest, @PathVariable Long id) {
        return new ResponseEntity<>(externProjectService.updateExternProject(id,externProjectDtoRequest), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteExternProject(@PathVariable Long id){
        externProjectService.deleteExternProjectById(id);

    }
}
