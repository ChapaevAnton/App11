package car;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

    public static void main(String[] args) {
        Map<TestMap,Integer> map = new TreeMap<>();
        map.put(new TestMap(),2);
        map.put(new TestMap(),4);
        System.out.println(map.size());

        Map<String, Integer> map1 = new TreeMap<>();

        map1.put("One", 1);
        map1.put("Two", 2);
        map1.put("Three", 3);

        map1.remove(new String("One"));

        System.out.println(map1.containsKey("One"));

    }
}
