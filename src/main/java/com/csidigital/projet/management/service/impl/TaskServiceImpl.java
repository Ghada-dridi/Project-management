package com.csidigital.projet.management.service.impl;

import com.csidigital.projet.dao.entity.Position;
import com.csidigital.projet.dao.entity.Task;
import com.csidigital.projet.dao.repository.TaskRepository;
import com.csidigital.projet.management.service.TaskService;
import com.csidigital.projet.shared.dto.Request.TaskDtoRequest;
import com.csidigital.projet.shared.dto.Response.PositionDtoResponse;
import com.csidigital.projet.shared.dto.Response.TaskDtoResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<TaskDtoResponse> getAllTasks() {
        List<Task> tasks = taskRepository.findAll();
        List<TaskDtoResponse> taskList = new ArrayList<>();

        for (Task task : tasks) {
            TaskDtoResponse taskDtoResponse = modelMapper.map(task,TaskDtoResponse.class);
            taskList.add(taskDtoResponse);
        }

        return taskList;
    }

    @Override
    public TaskDtoResponse getTaskById(Long id) {
        Task task = taskRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Task with id " +id+ " not found"));
        TaskDtoResponse taskDtoResponse = modelMapper.map(task, TaskDtoResponse.class);
        return taskDtoResponse;
    }

    @Override
    public TaskDtoResponse createTask(TaskDtoRequest taskDtoRequest) {
        Task task = modelMapper.map(taskDtoRequest, Task.class);
        Task TaskSaved = taskRepository.save(task);
        return modelMapper.map(TaskSaved, TaskDtoResponse.class);
    }

    @Override
    public TaskDtoResponse updateTask(Long id, TaskDtoRequest taskDtoRequest) {
        Task task = taskRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Task with id: " + id + " not found"));
        modelMapper.map(taskDtoRequest, task);
        Task updatedTask = taskRepository.save(task);
        return modelMapper.map(updatedTask, TaskDtoResponse.class);
    }

    @Override
    public void deleteTaskById(Long id) {
        taskRepository.deleteById(id);

    }
}
