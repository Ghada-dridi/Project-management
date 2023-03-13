package com.csidigital.projet.management.service.impl;

import com.csidigital.projet.management.service.InternProjectService;
import com.csidigital.projet.shared.dto.Request.InternProjectDtoRequest;
import com.csidigital.projet.shared.dto.Response.InternProjectDtoResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InternProjectServiceImpl implements InternProjectService {
    @Override
    public List<InternProjectDtoResponse> getAllInternProjects() {
        return null;
    }

    @Override
    public InternProjectDtoResponse getInternProjectById(Long id) {
        return null;
    }

    @Override
    public InternProjectDtoResponse createInternProject(InternProjectDtoRequest internProjectDtoRequest) {
        return null;
    }

    @Override
    public InternProjectDtoResponse updateInternProject(Long id, InternProjectDtoResponse internProjectDtoResponse) {
        return null;
    }

    @Override
    public void deleteInternProjectById(Long id) {

    }
}
