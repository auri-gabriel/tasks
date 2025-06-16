package com.aurigabriel.tasks.mappers;

import com.aurigabriel.tasks.domain.dto.TaskDto;
import com.aurigabriel.tasks.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);
    TaskDto toDto(Task task);
}
