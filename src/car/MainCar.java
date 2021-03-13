package car;

import java.util.*;

public class MainCar {


    private static String KIA = "KIA";
    private static String TOYOTA = "TOYOTA";
    private static String MAZDA = "MAZDA";

    public static void main(String[] args) {


        Car car1 = new Car(KIA, "9", false);
        Car car2 = new Car(KIA, "8", false);
        Car car3 = new Car(TOYOTA, "7", false);
        Car car4 = new Car(TOYOTA, "6", false);
        Car car5 = new Car(TOYOTA, "5", false);
        Car car6 = new Car(MAZDA, "4", false);
        Car car7 = new Car(MAZDA, "3", false);
        Car car8 = new Car(MAZDA, "2", false);
        Car car9 = new Car(KIA, "1", false);
        Car car10 = new Car(KIA, "0", false);
        Car car11 = new Car(TOYOTA, "9", false);
        Car car12 = new Car(TOYOTA, "8", false);
        Car car13 = new Car(TOYOTA, "7", false); //+
        Car car14 = new Car(MAZDA, "6", false);
        Car car15 = new Car(MAZDA, "5", false);
        Car car16 = new Car(MAZDA, "4", false);//+

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        carList.add(car11);
        carList.add(car12);
        carList.add(car13);
        carList.add(car14);
        carList.add(car15);
        carList.add(car16);

        System.out.println("выводим лист");
        for (Car car: carList){
            System.out.println(car);
        }
        System.out.println("=================");
        // TODO: 13.03.2021 11.7
//        Set<Car> carSet = new TreeSet<>(MyComparator.getModelComparing.reversed());
//        Set<Car> carSet1 = new TreeSet<>(MyComparator.getNameComparing.reversed());
//        carSet.addAll(carList);
//        carSet1.addAll(carList);
//
//        for (Car car : carSet) {
//            System.out.println(car);
//        }
//        System.out.println("=================");
//
//        for (Car car : carSet1) {
//            System.out.println(car);
//        }


//        System.out.println("=================");
//        // TODO: 13.03.2021 11.6
//        Map<Car, Integer> carMap = new HashMap<>(100, 0.5f);
//
//        for (Car car : carList) {
//            if (carMap.containsKey(car)) {
//                int count = carMap.get(car);
//                carMap.put(car, ++count);
//            } else {
//                carMap.put(car, 1);
//            }
//        }


        //QUESTION: 13.03.2021 После того как я переношу из List в HashMap - пропадает 2 значения
        // - это понятно совпадает два ключа и значения по ним заменятся.
        // Почему после того как я переношу HashMap в сортированный TreeMap часть (4 шт)
        // значений пропадает, куда? и почему?
        Map<Car, Integer> carHashMapQuest = new HashMap<>();
        int count = 0;
        for (Car car : carList) {
            carHashMapQuest.put(car, ++count);
        }

        for (Map.Entry<Car, Integer> itemCarMap : carHashMapQuest.entrySet()) {
            System.out.println(itemCarMap.getKey() + "->" + itemCarMap.getValue());
        }




        Map<Car, Integer> carTreeMap = new TreeMap<>(Comparator.comparing(Car::getBrand).thenComparing(Car::getModel));
        Map<Car, Integer> carTreeMap1 = new TreeMap<>(Comparator.comparing(Car::getBrand).thenComparing(Car::getModel));
        carTreeMap.putAll(carHashMapQuest);


        System.out.println("=================");

        for (Map.Entry<Car, Integer> itemCarMap : carTreeMap.entrySet()) {
            System.out.println(itemCarMap.getKey() + "->" + itemCarMap.getValue());
        }

        System.out.println("carList->"+carList.size());
        System.out.println("carHashMapQuest->"+carHashMapQuest.size());
        System.out.println("carTreeMap->"+carTreeMap.size());


        // TODO: 09.03.2021 10.4
//        List<Car> newCarList = carList;
//
//        Iterator<Car> carIterator = carList.iterator();
//
//        while (carIterator.hasNext()) {
//            Car car = carIterator.next();
//            if (car.getBrand().equals(TOYOTA)) {
//                carIterator.remove();
//            } else if (car.getBrand().equals(MAZDA)) {
//                car.setSale(true);
//            }
//        }
//
//
//
//        Set<Car> serCar = new HashSet<>(newCarList);
//
//        for (Car car : serCar) {
//            System.out.println(car);
//        }

    }
}
