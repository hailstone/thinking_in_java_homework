package exercises.chapter7_polymorphism.ex1;

public class Cycle {
    public void go() {
        System.out.println("cycle");
    }
}

class Unicycle extends Cycle {
    @Override
    public void go() {
        System.out.println("unicycle");
    }
}

class Bicycle extends Cycle {
    @Override
    public void go() {
        System.out.println("bicycle");
    }
}

class Tricycle extends Cycle {
    @Override
    public void go() {
        System.out.println("tricycle");
    }
}

class App {
    public static void ride(Cycle c) {
        c.go();
    }

    public static void main(String... args) {
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
        ride(new Cycle());
    }
}
