package io.github.felipevenas.api_tasklist.components;

import io.github.felipevenas.api_tasklist.domain.entities.Task;
import io.github.felipevenas.api_tasklist.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskValidator {

    @Autowired
    private TaskRepository taskRepository;

    public void validator(Task task) {
        if(alreadyExistsTask(task.getTitle())) {
            throw new IllegalArgumentException("Already exists an task with this title!");
        }
    }

    private boolean alreadyExistsTask (String title) {
        return taskRepository.existsByTitle(title);
    }
}
