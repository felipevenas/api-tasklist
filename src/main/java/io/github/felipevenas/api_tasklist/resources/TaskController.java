package io.github.felipevenas.api_tasklist.resources;

import io.github.felipevenas.api_tasklist.domain.entities.Task;
import io.github.felipevenas.api_tasklist.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping
    public void saveTask(@RequestBody Task newTask) {
        this.taskService.saveTask(newTask);
    }

    @PutMapping("{id}")
    public void updateTask(
            @PathVariable("id") Integer id, @RequestBody Task task) {
        task.setId(id);
        taskService.updateTask(task);
    }

    @GetMapping("{id}")
    public Task findById(@PathVariable("id") Integer id) {
        return taskService.findById(id);
    }
}
