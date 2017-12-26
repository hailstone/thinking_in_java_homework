package exercises.chapter7_polymorphism.ex17;

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

    public void balance() {
        System.out.println("unicycle keep balance");
    }
}

class Bicycle extends Cycle {
    @Override
    public void go() {
        System.out.println("bicycle");
    }

    public void balance() {
        System.out.println("bicycle keep balance");
    }
}

class Tricycle extends Cycle {
    @Override
    public void go() {
        System.out.println("tricycle");
    }
}

class App {
    public static void main(String... args) {
        Cycle[] cycleArr = {new Unicycle(), new Bicycle(), new Tricycle()};
        for (Cycle cycle : cycleArr) {
        }
    }
}
