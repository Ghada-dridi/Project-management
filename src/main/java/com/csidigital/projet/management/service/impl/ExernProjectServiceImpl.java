package com.csidigital.projet.management.service.impl;

import com.csidigital.projet.dao.entity.ExternProject;
import com.csidigital.projet.dao.entity.Project;
import com.csidigital.projet.dao.repository.ExternProjectRepository;
import com.csidigital.projet.management.service.ExternProjectService;
import com.csidigital.projet.shared.dto.Request.ExternProjectDtoRequest;
import com.csidigital.projet.shared.dto.Response.ExternProjectDtoResponse;
import com.csidigital.projet.shared.dto.Response.ProjectDtoResponse;
import org.modelmapper.ModelMapper;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ExernProjectServiceImpl implements ExternProjectService {
    private ModelMapper modelMapper;
    private ExternProjectRepository externProjectRepository;
    @Override
    public List<ExternProjectDtoResponse> getAllExternProjects() {
        List<ExternProject> externProjects = externProjectRepository.findAll();
        List<ExternProjectDtoResponse> externProjectList = new ArrayList<>();

        for (ExternProject externProject : externProjects) {
            ExternProjectDtoResponse externProjectDtoResponse = modelMapper.map(externProject, ExternProjectDtoResponse.class);
            externProjectList.add(externProjectDtoResponse);
        }

        return externProjectList;
    }

    @Override
    public ExternProjectDtoResponse getExternProjectById(Long id) {
        ExternProject externProject = externProjectRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("ExternProject with id " +id+ " not found"));
        ExternProjectDtoResponse externProjectDtoResponse = modelMapper.map(externProject,ExternProjectDtoResponse .class);
        return externProjectDtoResponse;
    }

    @Override
    public ExternProjectDtoResponse createExternProject(ExternProjectDtoRequest externProjectDtoRequest) {
        ExternProject externProject = modelMapper.map(externProjectDtoRequest, ExternProject.class);
        ExternProject ExternProjectSaved = externProjectRepository.save(externProject);
        return modelMapper.map(ExternProjectSaved, ExternProjectDtoResponse.class);
    }

    @Override
    public ExternProjectDtoResponse updateExternProject(Long id, ExternProjectDtoRequest externProjectDtoRequest) {
        ExternProject externProject = externProjectRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("ExternProject with id: " + id + " not found"));
        modelMapper.map(externProjectDtoRequest, externProject);
        ExternProject updatedExternProject = externProjectRepository.save(externProject);
        return modelMapper.map(updatedExternProject, ExternProjectDtoResponse.class);
    }

    @Override
    public void deleteExternProjectById(Long id) {
        externProjectRepository.deleteById(id);

    }
}
