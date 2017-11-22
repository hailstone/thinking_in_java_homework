package exercises.chapter4_Initialization_And_Cleanup;

public class Ex3 {
    public Ex3() {
        System.out.println("I am the default constructor");
    }

    public static void main(String[] args) {
        new Ex3();
    }
}
