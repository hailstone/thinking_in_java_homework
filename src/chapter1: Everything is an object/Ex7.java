public class Ex7 {
    public static void main(String[] args) {
        Incrementable.increment();
        System.out.println(StaticTest.i);
    }
}

class Incrementable {
    static void increment() {
        StaticTest.i++;
    }
}

class StaticTest {
    static int i = 47;
}