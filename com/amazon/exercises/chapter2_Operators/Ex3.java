package exercises.chapter2_Operators;

public class Ex3 {
    public static void changeData(Data2 d) {
        d.f = 33;
    }

    public static void main(String[] args) {
        Data2 d = new Data2();
        d.f = 11;
        System.out.println(d.f);

        changeData(d);
        System.out.println(d.f);
    }
}

class Data2 {
    float f;
}
