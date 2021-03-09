package car;

class Car {

    private String brand;
    private String model;
    private boolean sale;

    Car(String brand, String model, boolean sale) {
        this.brand = brand;
        this.model = model;
        this.sale = sale;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isSale() {
        return sale;
    }

    public void setSale(boolean sale) {
        this.sale = sale;
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
