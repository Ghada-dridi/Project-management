package com.csidigital.projet.management.service;

import com.csidigital.projet.shared.dto.Request.ClientReviewDtoRequest;
import com.csidigital.projet.shared.dto.Request.TaskDtoRequest;
import com.csidigital.projet.shared.dto.Response.ClientReviewDtoResponse;
import com.csidigital.projet.shared.dto.Response.TaskDtoResponse;

import java.util.List;

public interface TaskService {

    // Get All tasks
    List<TaskDtoResponse> getAllTasks();

    // Get task by id
    TaskDtoResponse getTaskById(Long id);

    // Add new task
    TaskDtoResponse createTask(TaskDtoRequest taskDtoRequest);


    // Update task by id

    TaskDtoResponse updateTask(Long id,TaskDtoRequest taskDtoRequest);


    //delete task by id
    void deleteTaskById(Long id);
}
