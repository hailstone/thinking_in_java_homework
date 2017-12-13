package exercises.chapter4_initialization_and_cleanup;

public class Ex4 {
    public Ex4() {
        System.out.println("I am the default constructor");
    }

    public Ex4(String s) {
        System.out.println("I am not the default constructor, my name is: " + s);
    }

    public static void main(String[] args) {
        new Ex4();
        new Ex4("li");
    }
}
