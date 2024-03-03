package l34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class TaskManager {
    static String[] taskList = new String[6];

    static  int[] idList = new int[taskList.length];
    static class Task {

        private static int id;
        private String name;
        private String description;
        private String date;

        protected static String status;
        protected int count = 0;

        private static int indexOfBook = 0;

        Task(String name, String description, String date, int id, int stat) {

            this.description = description;

            this.name = name;

            Task.id = id;

            this.date = date;

            if (stat == 1) {
                status = l34.status.init.getObject();
            }
            else if (stat == 2) {
                status = l34.status.inProgress.getObject();
            }

            else if (stat == 3) {
                status = l34.status.ending.getObject();
            }

        }
        public void addObj(String name, String description, String date, int id, int stat) {
            taskList[count] = name + " " + description+" "+date+" "+id+" ";
            idList[indexOfBook] = id;
            indexOfBook++;
            count++;
            if (count >= taskList.length) {
                taskList = Arrays.copyOf(taskList, taskList.length + 1);
                idList = Arrays.copyOf(idList,taskList.length);
            }
        }
        public void removeObject(int index) {
            for (int i = index; i < taskList.length - 1; i++) {
                if (count >= taskList.length) {
                    taskList = Arrays.copyOf(taskList, taskList.length + 1);
                    idList = Arrays.copyOf(idList,taskList.length);
                } else if (index == taskList.length) {
                    taskList = Arrays.copyOf(taskList, taskList.length - 1);
                    idList = Arrays.copyOf(idList,taskList.length);
                } else {
                    taskList[index] = taskList[index + 1];
                    idList[index]=idList[index + 1];
                    index++;
                    if (index == taskList.length) {
                        taskList = Arrays.copyOf(taskList, taskList.length - 1);
                        idList = Arrays.copyOf(idList,taskList.length);
                    }

                }

            }
            count--;

        }


       /* public void changeStatus(String name, String name1) {
            do {
                if (a[index21].equals(name)) {
                    a[index21] = name1;
                } else {
                    index21++;
                }
            } while (index21 < count);
        }*/
        public void changeStatus(int id, int stat)
        {
            int index21 = 0;
            do {
                if (idList[index21] == id) {

                    if (stat == 1) {
                        Task.status = l34.status.init.getObject();
                    } else if (stat == 2) {
                        Task.status = l34.status.inProgress.getObject();
                    } else if (stat == 3) {
                        Task.status = l34.status.ending.getObject();
                    } else {
                        System.out.println("Выбериет цифру 1 , 2 или 3 для выбора статуса");
                    }
                    taskList[index21] = taskList[index21];
                    break;


                } else {
                    index21++;
                }
            }while(index21!=idList.length);
            }
        public void showTaskList() {
            for (int i = 0; i < count; i++) {
                System.out.println(taskList[i] + status);

            }
        }
        }
        public void findTask() {
            Scanner scaner = new Scanner(System.in);
            int taskId;
            do {
                System.out.print("Enter id of Book to find it :");
                taskId = scaner.nextInt();
                int index21 = 0;
                do {
                    if (taskId == idList[index21]) {
                        System.out.println(taskList[index21]);
                        break;
                    } else {
                        index21++;
                    }
                } while (index21 != idList.length);

            } while (taskId != 0);
        }


     }