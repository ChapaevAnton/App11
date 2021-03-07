package shipp;

public class Main {

    // TODO: 07.03.2021 11.3.2
    public static void main(String[] args) {

        ShippableBox shippableBox = new ShippableBox();
        Box<String> box = new Box<>("книга");

        shippableBox.ship(box);
        shippableBox.ship(new Box<Number>(1));


    }
}
