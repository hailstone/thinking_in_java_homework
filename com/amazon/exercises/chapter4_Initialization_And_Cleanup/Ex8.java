package exercises.chapter4_Initialization_And_Cleanup;

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
