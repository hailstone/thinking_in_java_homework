package exercises.chapter6_reusing_classes.ex8;

public class Base {
    public Base(int i) {
        System.out.println("base");
    }
}

class Derived extends Base {
    public Derived() {
        super(11);
        System.out.println("default derived");
    }

    public Derived(int i) {
        super(i);
        System.out.println("parameterized derived");
    }
}
