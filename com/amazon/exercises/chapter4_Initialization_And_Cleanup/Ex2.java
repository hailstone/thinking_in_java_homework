package exercises.chapter4_initialization_and_cleanup;

public class Ex2 {
    String s1 = "abc";
    String s2;

    public Ex2() {
        s2 = "ddd";
    }

    public static void main(String[] args) {
        Ex2 ex = new Ex2();
        System.out.println(ex.s1);
        System.out.println(ex.s2);
    }
}
