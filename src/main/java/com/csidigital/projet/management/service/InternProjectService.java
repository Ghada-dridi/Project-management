package com.csidigital.projet.management.service;

import com.csidigital.projet.shared.dto.Request.InternProjectDtoRequest;
import com.csidigital.projet.shared.dto.Response.InternProjectDtoResponse;
import org.springframework.stereotype.Service;

import java.util.List;

public interface InternProjectService {
    // Get All InternProjects
    List<InternProjectDtoResponse> getAllInternProjects();

    // Get InternProject by id
    InternProjectDtoResponse getInternProjectById(Long id);

    // Add new InternProject
    InternProjectDtoResponse createInternProject(InternProjectDtoRequest internProjectDtoRequest);


    // Update InternProject by id

    InternProjectDtoResponse updateInternProject(Long id, InternProjectDtoRequest internProjectDtoRequest);


    //delete InternProject by id
    void deleteInternProjectById(Long id);
}
