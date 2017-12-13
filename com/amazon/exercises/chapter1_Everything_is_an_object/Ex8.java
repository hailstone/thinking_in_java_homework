package exercises.chapter1_everything_is_an_object;

public class Ex8 {
    static int i = 1;

    public static void main(String[] args) {
        Ex8 a = new Ex8();
        Ex8 b = new Ex8();
        a.i++;
        System.out.println(a.i);
        System.out.println(b.i);
    }
}
