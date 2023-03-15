package com.csidigital.projet.management.controller;


import com.csidigital.projet.management.service.ProjectService;
import com.csidigital.projet.shared.dto.Request.ProjectDtoRequest;
import com.csidigital.projet.shared.dto.Request.TaskDtoRequest;
import com.csidigital.projet.shared.dto.Response.ProjectDtoResponse;
import com.csidigital.projet.shared.dto.Response.TaskDtoResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/project")
public class ProjectController {
    private final ProjectService projectService;
    @GetMapping("/getAllProjects")
    public ResponseEntity<List<ProjectDtoResponse>> getAllProjects() {
        return new ResponseEntity<>(projectService.getAllProjects(), HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<ProjectDtoResponse> getProjectById(@PathVariable Long id) {
        return new ResponseEntity<>(projectService.getProjectById(id), HttpStatus.OK);
    }
    @PostMapping("/addProject")
    public ResponseEntity<ProjectDtoResponse> createProject(@Valid @RequestBody ProjectDtoRequest projectDtoRequest) {
        return new ResponseEntity<>(projectService.createProject(projectDtoRequest), HttpStatus.OK);
    }

    @PutMapping("/updateProject/{id}")
    public ResponseEntity<ProjectDtoResponse> updateProject(@Valid @RequestBody ProjectDtoRequest projectDtoRequest, @PathVariable Long id) {
        return new ResponseEntity<>(projectService.updateProject(id,projectDtoRequest), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProject(@PathVariable Long id){
        projectService.deleteProjectById(id);

    }
}
