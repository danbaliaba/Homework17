package l34New;
import l34New.Task;

import java.util.ArrayList;
import java.util.Arrays;
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
    public Task changeStatus(int id, TaskStatus status)
    {
        for (Task task : tasks)
        {
            if(task.getId()!=id){continue;}
            else {
                task.setStatus(status);
                return task;
            }
        }
        return null;
    }
    public void showList(){
        System.out.println(tasks);
    }
}
