package exercises.chapter7_polymorphism.ex9;

public class Rodent {
    public void say() {
        System.out.println("rodent");
    }
}

class Mouse extends Rodent {
    @Override
    public void say() {
        System.out.println("mouse");
    }
}

class Gerbil extends Rodent {
    @Override
    public void say() {
        System.out.println("gerbil");
    }
}

class Hamster extends Rodent {
    @Override
    public void say() {
        System.out.println("hamster");
    }
}

class App {
    public static void main(String[] args) {
        Rodent[] rodents = {new Mouse(), new Gerbil(), new Hamster()};
        for (Rodent rodent : rodents) {
            rodent.say();
        }
    }
}
