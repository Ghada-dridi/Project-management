package com.csidigital.projet.management.controller;

import com.csidigital.projet.management.service.TaskService;
import com.csidigital.projet.shared.dto.Request.PositionDtoRequest;
import com.csidigital.projet.shared.dto.Request.TaskDtoRequest;
import com.csidigital.projet.shared.dto.Response.PositionDtoResponse;
import com.csidigital.projet.shared.dto.Response.TaskDtoResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/task")
public class TaskController {
    private final TaskService taskService;
    @GetMapping("/getAll")
    public ResponseEntity<List<TaskDtoResponse>> getAllTasks() {
        return new ResponseEntity<>(taskService.getAllTasks(), HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<TaskDtoResponse> getTaskById(@PathVariable Long id) {
        return new ResponseEntity<>(taskService.getTaskById(id), HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<TaskDtoResponse> createTask(@Valid @RequestBody TaskDtoRequest taskDtoRequest) {
        return new ResponseEntity<>(taskService.createTask(taskDtoRequest), HttpStatus.OK);
    }

    @PutMapping("/updateById/{id}")
    public ResponseEntity<TaskDtoResponse> updateTask(@Valid @RequestBody TaskDtoRequest taskDtoRequest, @PathVariable Long id) {
        return new ResponseEntity<>(taskService.updateTask(id,taskDtoRequest), HttpStatus.OK);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteTask(@PathVariable Long id){
        taskService.deleteTaskById(id);

    }


}
