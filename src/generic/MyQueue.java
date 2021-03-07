package generic;

import java.util.LinkedList;

public class MyQueue {

    // TODO: 07.03.2021 11.3
    public static void main(String[] args) {

        MyGeneric<String, Integer, Double> generic = new MyGeneric<>();

        generic.doubleValue = 1.0;
        generic.intValue = 1;
        generic.stringValue = "1";

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add(new String("test"));
//        linkedList.add(new Date());
//        linkedList.add(Integer.valueOf(1));


        String str = linkedList.get(0);
    }

}
