package shipp;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {

    // TODO: 07.03.2021 11.3.2
    public static void main(String[] args) {

        ShippableBox shippableBox = new ShippableBox();
        Box<String> box = new Box<>("книга");

        shippableBox.ship(box);
        shippableBox.ship(new Box<Number>(1));

        Collection<? extends String> collection = new LinkedList<>(); // 2
        collection.add("Hello"); // 3
        System.out.println(collection.size());


    }

    private static void modifyList(List<? extends Number> list) {

        list.get(0).doubleValue();
        list.add(5.6d); // does not compile
        list.add(131232134342344L); // does not compile
        list.add(118); // does not compile
    }

}
