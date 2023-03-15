package com.csidigital.projet.management.service.impl;

import com.csidigital.projet.dao.entity.Position;
import com.csidigital.projet.dao.entity.Project;
import com.csidigital.projet.dao.repository.ProjectRepository;
import com.csidigital.projet.management.service.ProjectService;
import com.csidigital.projet.shared.dto.Request.PositionDtoRequest;
import com.csidigital.projet.shared.dto.Request.ProjectDtoRequest;
import com.csidigital.projet.shared.dto.Response.PositionDtoResponse;
import com.csidigital.projet.shared.dto.Response.ProjectDtoResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ProjectRepository projectRepository;


    @Override
    public List<ProjectDtoResponse> getAllProjects() {

        List<Project> projects = projectRepository.findAll();
        List<ProjectDtoResponse> projectList = new ArrayList<>();

        for (Project project : projects) {
            ProjectDtoResponse projectDtoResponse = modelMapper.map(project, ProjectDtoResponse.class);
            projectList.add(projectDtoResponse);
        }

        return projectList;
    }

    @Override
    public ProjectDtoResponse getProjectById(Long id) {
        Project project = projectRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Project with id " +id+ " not found"));
        ProjectDtoResponse projectDtoResponse = modelMapper.map(project, ProjectDtoResponse.class);
        return projectDtoResponse;

    }

    @Override
    public ProjectDtoResponse createProject(ProjectDtoRequest projectDtoRequest) {
        Project project = modelMapper.map(projectDtoRequest, Project.class);
        Project ProjectSaved = projectRepository.save(project);
        return modelMapper.map(ProjectSaved, ProjectDtoResponse.class);
    }

    @Override
    public ProjectDtoResponse updateProject(Long id, ProjectDtoRequest projectDtoRequest) {
        Project project = projectRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Project with id: " + id + " not found"));
        modelMapper.map(projectDtoRequest, project);
      Project updatedProject = projectRepository.save(project);
        return modelMapper.map(updatedProject, ProjectDtoResponse.class);
    }

    @Override
    public void deleteProjectById(Long id) {
        projectRepository.deleteById(id);

    }
}
