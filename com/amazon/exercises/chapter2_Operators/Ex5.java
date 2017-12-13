package exercises.chapter2_operators;

public class Ex5 {
    public static void main(String[] args) {
        Dog spot = new Dog("who says", "Ruff!");
        Dog scruffy = new Dog("who says", "Wurf!");

        System.out.println(spot.name);
        System.out.println(spot.says);

        System.out.println(scruffy.name);
        System.out.println(scruffy.says);
    }
}

class Dog {
    String name;
    String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }
}