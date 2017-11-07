package exercises.chapter2_Operators;

public class Ex8 {
    public static void main(String[] args) {
        long hex = 0x7777L;
        long oct = 0777L;
        System.out.println(hex);
        System.out.println(oct);

        System.out.println(Long.toBinaryString(hex));
        System.out.println(Long.toBinaryString(oct));
    }
}
