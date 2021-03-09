package shipp;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {

    // TODO: 07.03.2021 11.3.2
    public static void main(String[] args) {


        ShippableBox shippableBox = new ShippableBox();
        MyBox<String> myBox = new MyBox<>("книга");

        shippableBox.ship(myBox);
        shippableBox.ship(new MyBox("документы"));

        Collection<? super String > collection = new LinkedList<>(); // 2
        collection.add("Hello"); // 3
        System.out.println(collection.size());


    }

    private static void modifyList(List<? super Number> list) {

        list.get(0);
        list.add(5.6d); // does not compile
        list.add(131232134342344L); // does not compile
        list.add(118); // does not compile
    }

}
