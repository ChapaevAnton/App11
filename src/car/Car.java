package car;

import java.util.Objects;

// TODO: 10.03.2021 10.5

class Car {



    private final String brand;
    private final String model;
    private boolean sale;

    Car(String brand, String model, boolean sale) {
        if (brand == null || model == null) throw new IllegalArgumentException();
        this.brand = brand;
        this.model = model;
        this.sale = sale;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }


    public boolean isSale() {
        return sale;
    }

    public void setSale(boolean sale) {
        this.sale = sale;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;
        return brand.equals(car.brand) && model.equals(car.model);


    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", sale=" + sale +
                '}';
    }


}
