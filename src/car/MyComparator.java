package car;

import java.util.Comparator;

interface MyComparator {

    // TODO: 13.03.2021 11.7
    class NameComparator implements Comparator<Car> {
        @Override
        public int compare(Car car1, Car car2) {
            return car1.getBrand().compareTo(car2.getBrand());
        }
    }

   Comparator<Car> nameComparator = new Comparator<Car>() {
        @Override
        public int compare(Car car1, Car car2) {
            return car1.getBrand().compareTo(car2.getBrand());
        }
    };

    Comparator<Car> getNameComparator = (car1, car2) -> car1.getBrand().compareTo(car2.getBrand());

    Comparator<Car> getNameComparing = Comparator.comparing(Car::getBrand);

    Comparator<Car> getModelComparing = Comparator.comparing(Car::getModel);


}
