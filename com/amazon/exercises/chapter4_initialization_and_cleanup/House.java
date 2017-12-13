package exercises.chapter4_initialization_and_cleanup;

public class House {
    Window w1 = new Window(1);

    House() {
        System.out.println("house");
    }

    Window w2 = new Window(2);

    void f() {
        System.out.println("f()");
    }

    Window w3 = new Window(3);

    public static void main(String[] args) {
        new House();
    }
}


class Window {
    Window(int marker) {
        System.out.println("Window: " + marker);
    }
}