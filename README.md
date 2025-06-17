# 📝 Task Tracker API

A **Task Tracker API** built with **Spring Boot** and **Java 21** to help you manage task lists and individual tasks.

## 🚀 Features

- ✅ Create, read, update, and delete task lists
- ✅ Manage tasks within task lists
- ✅ RESTful API design
- ✅ Global error handling
- ✅ UUID-based resource identification

## 📦 Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Maven
- PostgreSQL

## 📁 Project Structure

```text
main/java/com/aurigabriel/tasks/
├── controllers
│   ├── GlobalExceptionHandler.java
│   ├── TaskListController.java
│   └── TasksController.java
├── domain
│   ├── dto
│   │   ├── ErrorResponse.java
│   │   ├── TaskDto.java
│   │   └── TaskListDto.java
│   └── entities
│       ├── Task.java
│       ├── TaskList.java
│       ├── TaskPriority.java
│       └── TaskStatus.java
├── mappers
│   ├── impl
│   │   ├── TaskListMapperImpl.java
│   │   └── TaskMapperImpl.java
│   ├── TaskListMapper.java
│   └── TaskMapper.java
├── repositories
│   ├── TaskListRepository.java
│   └── TaskRepository.java
├── services
│   ├── impl
│   │   ├── TaskListServiceImpl.java
│   │   └── TaskServiceImpl.java
│   ├── TaskListService.java
│   └── TaskService.java
└── TasksApplication.java

```

## 📌 API Endpoints

### 🔹 Task Lists

- `GET /api/task-lists` — List all task lists  
- `POST /api/task-lists` — Create a new task list  
- `GET /api/task-lists/{task_list_id}` — Get a specific task list  
- `PUT /api/task-lists/{task_list_id}` — Update a task list  
- `DELETE /api/task-lists/{task_list_id}` — Delete a task list  

### 🔸 Tasks

- `GET /api/task-lists/{task_list_id}/tasks` — List all tasks in a list  
- `POST /api/task-lists/{task_list_id}/tasks` — Create a task in a list  
- `GET /api/task-lists/{task_list_id}/tasks/{task_id}` — Get a specific task  
- `PUT /api/task-lists/{task_list_id}/tasks/{task_id}` — Update a task  
- `DELETE /api/task-lists/{task_list_id}/tasks/{task_id}` — Delete a task  
