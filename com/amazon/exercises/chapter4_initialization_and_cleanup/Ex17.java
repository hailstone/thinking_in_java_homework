package exercises.chapter4_initialization_and_cleanup;

public class Ex17 {
    public Ex17(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        Ex17[] arr = new Ex17[11];
    }
}
