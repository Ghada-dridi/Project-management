package com.csidigital.projet.management.service;

import com.csidigital.projet.shared.dto.Request.PositionDtoRequest;
import com.csidigital.projet.shared.dto.Request.ProjectDtoRequest;
import com.csidigital.projet.shared.dto.Response.PositionDtoResponse;
import com.csidigital.projet.shared.dto.Response.ProjectDtoResponse;

import java.util.List;

public interface ProjectService {


    // Get All projects
    List<ProjectDtoResponse> getAllProjects();

    // Get  by project id
    ProjectDtoResponse getProjectById(Long id);

    // Add new project
    ProjectDtoResponse createProject(ProjectDtoRequest projectDtoRequest);


    // Update project by id

    ProjectDtoResponse updateProject(Long id, ProjectDtoRequest projectDtoRequest);


    //delete project by id
    void deleteProjectById(Long id);
}
