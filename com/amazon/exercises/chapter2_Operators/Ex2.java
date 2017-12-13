package exercises.chapter2_operators;

public class Ex2 {
    public static void main(String[] args) {
        Data2 d1 = new Data2();
        Data2 d2 = new Data2();

        d1.f = 11;
        d2.f = 22;
        System.out.println(d1.f);
        System.out.println(d2.f);

        d1 = d2;
        d2.f = 33;
        System.out.println(d1.f);
    }
}

class Data {
    float f;
}
