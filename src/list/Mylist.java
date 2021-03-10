package list;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Mylist {

    private final long id;
    private final String name;
    private int age;

    public Mylist(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

// TODO: 10.03.2021 11.4.6
        List<Number> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        ArrayDeque<Number> arrayDeque = new ArrayDeque<>();

        for (Number item : list) {
            arrayDeque.push(item);
        }


        for (Number item : arrayDeque) {
            System.out.println(item);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mylist mylist = (Mylist) o;
        return id == mylist.id && age == mylist.age && name.equals(mylist.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
