package exercises.chapter7_polymorphism.ex10;

public class Base {
    public void first() {
        System.out.println("first");
        second();
    }

    public void second() {
        System.out.println("second");
    }
}

class Derived extends Base {
    @Override
    public void second() {
        System.out.println("derived second");
    }
}

class App {
    public static void main(String[] args) {
        Base base = new Derived();
        base.first();
    }
}
