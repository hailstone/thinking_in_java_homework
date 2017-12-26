package exercises.chapter7_polymorphism.ex12;

public class Rodent {
    public Rodent() {
        System.out.println("construct Rodent");
    }

    public void say() {
        System.out.println("rodent");
    }
}

class Mouse extends Rodent {
    public Mouse() {
        super();
        System.out.println("construct Mouse");
    }

    @Override
    public void say() {
        System.out.println("mouse");
    }
}

class Gerbil extends Rodent {
    public Gerbil() {
        super();
        System.out.println("construct Gerbil");
    }

    @Override
    public void say() {
        System.out.println("gerbil");
    }
}

class Hamster extends Rodent {
    public Hamster() {
        super();
        System.out.println("construct Hamster");
    }

    @Override
    public void say() {
        System.out.println("hamster");
    }
}

class App {
    public static void main(String[] args) {
        new Hamster();
    }
}
