import java.util.ArrayDeque;
import java.util.Deque;


public class Main {

    public static void main(String[] args) {

        // TODO: 06.03.2021 11.2.3
        
        final int COUNT = 5;
        Deque<String> jobQueue = new ArrayDeque(COUNT);

        Worker worker = new Worker(jobQueue);
        Boss boss = new Boss(jobQueue);

        System.out.println("Начальник назначил задания:");
        for (int i = 0; i < COUNT; i++) {
            boss.scheduleExecution("Задание №->" + i);
            System.out.println(jobQueue.element());
        }

        System.out.println(jobQueue);
        System.out.println(jobQueue.size());

        System.out.println("Работник выполняет задания:");

        for (int i = 0; i < COUNT; i++) {
            System.out.println(jobQueue.element());
            worker.starTasks();

        }

        System.out.println(jobQueue);
        System.out.println(jobQueue.size());

    }
}
