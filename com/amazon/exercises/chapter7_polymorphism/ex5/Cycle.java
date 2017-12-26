package exercises.chapter7_polymorphism.ex5;

public class Cycle {
    public void go() {
        System.out.println("cycle");
    }

    public int wheels() {
        return 0;
    }
}

class Unicycle extends Cycle {
    @Override
    public void go() {
        System.out.println("unicycle");
    }

    @Override
    public int wheels() {
        return 1;
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
        System.out.println(String.format("it has %d wheels", c.wheels()));
    }

    public static void main(String... args) {
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
        ride(new Cycle());
    }
}
