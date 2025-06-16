package com.aurigabriel.tasks.mappers;

import com.aurigabriel.tasks.domain.dto.TaskListDto;
import com.aurigabriel.tasks.domain.entities.TaskList;

public interface TaskListMapper {
    TaskList fromDto(TaskListDto taskListDto);
    TaskListDto toDto(TaskList taskList);
}
