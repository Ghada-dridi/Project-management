package com.csidigital.projet.management.service.impl;

import com.csidigital.projet.dao.entity.InternProject;
import com.csidigital.projet.dao.entity.Project;
import com.csidigital.projet.dao.repository.InternProjectRepository;
import com.csidigital.projet.management.service.InternProjectService;
import com.csidigital.projet.shared.dto.Request.InternProjectDtoRequest;
import com.csidigital.projet.shared.dto.Response.InternProjectDtoResponse;
import com.csidigital.projet.shared.dto.Response.ProjectDtoResponse;
import org.modelmapper.ModelMapper;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class InternProjectServiceImpl   implements InternProjectService {

    private InternProjectRepository internProjectRepository;
    private ModelMapper modelMapper;
    @Override
    public List<InternProjectDtoResponse> getAllInternProjects() {

        List<InternProject> internProjects= internProjectRepository.findAll();
        List<InternProjectDtoResponse> internProjectList = new ArrayList<>();

        for (InternProject internProject : internProjects) {
            InternProjectDtoResponse internProjectDtoResponse = modelMapper.map(internProject, InternProjectDtoResponse.class);
            internProjectList.add(internProjectDtoResponse);
        }

        return internProjectList;
    }

    @Override
    public InternProjectDtoResponse getInternProjectById(Long id) {
        InternProject internProject = internProjectRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("InternProject with id " +id+ " not found"));
        InternProjectDtoResponse internProjectDtoResponse = modelMapper.map(internProject, InternProjectDtoResponse.class);
        return internProjectDtoResponse;
    }

    @Override
    public InternProjectDtoResponse createInternProject(InternProjectDtoRequest internProjectDtoRequest) {

        InternProject internProject = modelMapper.map(internProjectDtoRequest, InternProject.class);
        InternProject InternProjectSaved = internProjectRepository.save(internProject);
        return modelMapper.map(InternProjectSaved, InternProjectDtoResponse.class);
    }

    @Override
    public InternProjectDtoResponse updateInternProject(Long id, InternProjectDtoRequest internProjectDtoRequest) {
        InternProject internProject = internProjectRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("InternProject with id: " + id + " not found"));
        modelMapper.map(internProjectDtoRequest, internProject);
        InternProject updatedInternProject = internProjectRepository.save(internProject);
        return modelMapper.map(updatedInternProject, InternProjectDtoResponse.class);
    }

    @Override
    public void deleteInternProjectById(Long id) {
        internProjectRepository.deleteById(id);

    }
}
