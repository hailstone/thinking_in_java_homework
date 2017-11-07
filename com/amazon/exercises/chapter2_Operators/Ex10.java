package exercises.chapter2_Operators;

public class Ex10 {
    public static void main(String[] args) {
        int a = 0x10;
        int b = 0x11;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));

        System.out.println(Integer.toBinaryString(a & b));
        System.out.println(Integer.toBinaryString(a | b));
    }
}
