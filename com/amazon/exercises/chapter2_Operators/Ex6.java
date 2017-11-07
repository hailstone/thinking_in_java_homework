package exercises.chapter2_Operators;

public class Ex6 {
    public static void main(String[] args) {
        Dog spot = new Dog("who says", "Ruff!");
        Dog scruffy = spot;

        System.out.println(spot == scruffy);
    }
}
