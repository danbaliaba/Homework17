package l34New;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String title) {
        Task task = new Task(title);
        this.tasks.add(task);
    }

    public Task remove(int id) {
        for (Task task : tasks) {
            if (task.getId() != id)
                continue;
            tasks.remove(task);
            return task;
        }
        return null;
    }
   // public Task
}
