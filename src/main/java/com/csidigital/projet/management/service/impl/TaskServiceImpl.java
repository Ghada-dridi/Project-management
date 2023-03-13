package com.csidigital.projet.management.service.impl;

import com.csidigital.projet.management.service.TaskService;
import com.csidigital.projet.shared.dto.Request.TaskDtoRequest;
import com.csidigital.projet.shared.dto.Response.TaskDtoResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskServiceImpl implements TaskService {
    @Override
    public List<TaskDtoResponse> getAllTasks() {
        return null;
    }

    @Override
    public TaskDtoResponse getTaskById(Long id) {
        return null;
    }

    @Override
    public TaskDtoResponse createTask(TaskDtoRequest taskDtoRequest) {
        return null;
    }

    @Override
    public TaskDtoResponse updateTask(Long id, TaskDtoRequest taskDtoRequest) {
        return null;
    }

    @Override
    public void deleteTaskById(Long id) {

    }
}
