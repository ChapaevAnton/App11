package shipp;

public class ShippableBox implements Shippable<MyBox> {


    @Override
    public void ship(MyBox stuff) {

        System.out.println(stuff.getContents());

    }
}
