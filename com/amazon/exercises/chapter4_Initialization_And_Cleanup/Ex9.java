package exercises.chapter4_Initialization_And_Cleanup;

public class Ex9 {
    public Ex9() {
        this("aaa");
        System.out.println("default");
    }

    public Ex9(String s) {
        System.out.println("with argument");
    }

    public static void main(String[] args) {
        new Ex9();
    }
}
