package epam;

class A {
    int var = 6;

    int exec() {
        return 5;
    }
}

class B extends A {
    int var;

    int exec() {
        return 10;
    }
}


public class Main {

    public static void main(String[] args) {

        B a = new B();
        System.out.println(a.exec());

    }

}
