import java.util.Deque;

public class Boss {

    private Deque<String> task;

    public Boss(Deque<String> task) {
        this.task = task;
    }

    public void scheduleExecution(String job) {
        task.push(job);
        System.out.println("Дал задачу:" + job);
    }

}
