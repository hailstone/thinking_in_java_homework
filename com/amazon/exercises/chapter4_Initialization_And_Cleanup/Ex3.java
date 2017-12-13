package exercises.chapter4_initialization_and_cleanup;

public class Ex3 {
    public Ex3() {
        System.out.println("I am the default constructor");
    }

    public static void main(String[] args) {
        new Ex3();
    }
}
