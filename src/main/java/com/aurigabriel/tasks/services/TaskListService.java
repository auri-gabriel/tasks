package com.aurigabriel.tasks.services;

import com.aurigabriel.tasks.domain.entities.TaskList;

import java.util.List;

public interface TaskListService {
    List<TaskList> listTaskLists();
}
