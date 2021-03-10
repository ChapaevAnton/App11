package car;

import java.util.*;

public class MainCar {

    // TODO: 09.03.2021 10.4
    private static String KIA = "KIA";
    private static String TOYOTA = "TOYOTA";
    private static String MAZDA = "MAZDA";

    public static void main(String[] args) {


        Car car1 = new Car(KIA, "1", false);
        Car car2 = new Car(KIA, "2", false);
        Car car3 = new Car(TOYOTA, "3", false);
        Car car4 = new Car(TOYOTA, "4", false);
        Car car5 = new Car(TOYOTA, "5", false);
        Car car6 = new Car(MAZDA, "6", false);
        Car car7 = new Car(MAZDA, "7", false);
        Car car8 = new Car(MAZDA, "8", false);
        Car car11 = new Car(KIA, "1", false);
        Car car12 = new Car(KIA, "2", false);
        Car car13 = new Car(TOYOTA, "3", false);
        Car car14 = new Car(TOYOTA, "4", false);
        Car car15 = new Car(TOYOTA, "5", false);
        Car car16 = new Car(MAZDA, "6", false);
        Car car17 = new Car(MAZDA, "7", false);
        Car car18 = new Car(MAZDA, "8", false);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car11);
        carList.add(car12);
        carList.add(car13);
        carList.add(car14);
        carList.add(car15);
        carList.add(car16);
        carList.add(car17);
        carList.add(car18);

        List<Car> newCarList = carList;

        Iterator<Car> carIterator = carList.iterator();

        while (carIterator.hasNext()) {
            Car car = carIterator.next();
            if (car.getBrand().equals(TOYOTA)) {
                carIterator.remove();
            } else if (car.getBrand().equals(MAZDA)) {
                car.setSale(true);
            }
        }



        Set<Car> serCar = new HashSet<>(newCarList);

        for (Car car : serCar) {
            System.out.println(car);
        }

    }
}
