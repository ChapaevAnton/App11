package list;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Mylist {

    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();

        for (int i = 0; i < 10; i++) {
            queue.add("книга №" + i);
        }



        List<String> list = new ArrayList<>(queue);

        for (String item : list) {
            System.out.println(item);
        }

        System.out.println(list.size());
        list.add(null);
        System.out.println(list.size());
        System.out.println(list.get(10));
        System.out.println(list.get(11));


    }
}
