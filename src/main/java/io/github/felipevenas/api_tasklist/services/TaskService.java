package io.github.felipevenas.api_tasklist.services;

import io.github.felipevenas.api_tasklist.components.TaskValidator;
import io.github.felipevenas.api_tasklist.domain.entities.Task;
import io.github.felipevenas.api_tasklist.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private TaskValidator taskValidator;

    public Task saveTask(Task newTask) {
        taskValidator.validator(newTask);
        return taskRepository.save(newTask);
    }

    public void updateTask(Task task) {
        taskRepository.save(task);
    }

    public Task findById(Integer id) {
        return taskRepository.findById(id).orElse(null);
    }

}
