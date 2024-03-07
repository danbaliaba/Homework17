package l34New;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("First task");
        taskManager.addTask("Second task");
        taskManager.addTask("Third task");
        taskManager.addTask("Fourth task");
        taskManager.addTask("Fifth task");
        taskManager.remove(829234);
        taskManager.changeStatus(829235,TaskStatus.IN_PROGRESS);
        taskManager.showList();
    }
}
