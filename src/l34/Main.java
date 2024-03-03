package l34;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        TaskManager tasks = new TaskManager();
        TaskManager.Task task = new TaskManager.Task("wed", "wef", "234234", 1, 2);
        task.addObj("Work", "Everything about work", "06/09/1990", 1, 1);
        task.addObj("Fun", "Everything about fun time", "06/26/1995", 2, 1);
        task.addObj("Family", "Everything about family", "06/05/1985", 3, 2);
        task.addObj("Kids", "Everything about kids", "07/17/1988", 4, 3);
        task.addObj("Friends", "Everything about friends", "03/31/2002", 5, 3);
        task.addObj("Parents", "Everything about parents", "09/13/2003", 6, 2);
        task.removeObject(1);
        task.changeStatus(6,3);

        task.showTaskList();

        tasks.findTask();

    }
}
