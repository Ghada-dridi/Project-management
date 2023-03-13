package com.csidigital.projet.management.service.impl;

import com.csidigital.projet.management.service.ExternProjectService;
import com.csidigital.projet.shared.dto.Request.ExternProjectDtoRequest;
import com.csidigital.projet.shared.dto.Response.ExternProjectDtoResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExernProjectServiceImpl implements ExternProjectService {
    @Override
    public List<ExternProjectDtoResponse> getAllExternProjects() {
        return null;
    }

    @Override
    public ExternProjectDtoResponse getExternProjectById(Long id) {
        return null;
    }

    @Override
    public ExternProjectDtoResponse createExternProject(ExternProjectDtoRequest externProjectDtoRequest) {
        return null;
    }

    @Override
    public ExternProjectDtoResponse updateExternProject(Long id, ExternProjectDtoRequest externProjectDtoRequest) {
        return null;
    }

    @Override
    public void deleteExternProjectById(Long id) {

    }
}
