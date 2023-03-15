package com.csidigital.projet.management.service;

import com.csidigital.projet.shared.dto.Request.ExternProjectDtoRequest;
import com.csidigital.projet.shared.dto.Request.TaskDtoRequest;
import com.csidigital.projet.shared.dto.Response.ExternProjectDtoResponse;
import com.csidigital.projet.shared.dto.Response.TaskDtoResponse;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ExternProjectService  {

    // Get All ExternProjects
    List<ExternProjectDtoResponse> getAllExternProjects();

    // Get ExternProject by id
    ExternProjectDtoResponse getExternProjectById(Long id);

    // Add new ExternProject
    ExternProjectDtoResponse createExternProject(ExternProjectDtoRequest externProjectDtoRequest);


    // Update ExternProject by id

    ExternProjectDtoResponse updateExternProject(Long id,ExternProjectDtoRequest externProjectDtoRequest);


    //delete ExternProject by id
    void deleteExternProjectById(Long id);
}
