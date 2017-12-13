package exercises.chapter4_initialization_and_cleanup;

public class Ex14 {
    static String a = "aa";
    static String b;

    static {
        b = "bb";
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }
}
