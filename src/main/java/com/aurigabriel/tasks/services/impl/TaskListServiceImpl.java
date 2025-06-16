package com.aurigabriel.tasks.services.impl;

import com.aurigabriel.tasks.domain.entities.TaskList;
import com.aurigabriel.tasks.repositories.TaskListRepository;
import com.aurigabriel.tasks.services.TaskListService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskListServiceImpl implements TaskListService {

    private TaskListRepository taskListRepository;

    public TaskListServiceImpl(TaskListRepository taskListRepository) {
        this.taskListRepository = taskListRepository;
    }

    @Override
    public List<TaskList> listTaskLists() {
        return taskListRepository.findAll();
    }
}
