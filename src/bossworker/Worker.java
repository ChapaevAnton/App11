package bossworker;

import java.util.Deque;

public class Worker {

    private Deque<String> task;

    public Worker(Deque<String> task) {
        this.task = task;
    }

    public void starTasks() {

        String job = task.pop();
        if (job != null) {
            System.out.println("Выполняю работу:" + job);
        } else {
            System.out.println("Список заданий пуст...");
        }
    }

}
