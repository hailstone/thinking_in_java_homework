package exercises.chapter4_initialization_and_cleanup;

public class Ex8 {
    public void first() {
        System.out.println("first");
        second();
        this.second();
    }

    public void second() {
        System.out.println("second");
    }

    public static void main(String[] args) {
        new Ex8().first();
    }
}
