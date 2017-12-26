package exercises.chapter6_reusing_classes.ex16;

public class Amphibian {
    public void go() {
        System.out.println("go");
    }
}

class Frog extends Amphibian {
    public static void main(String... args) {
        Frog frog = new Frog();
        frog.go();
        Amphibian amphibian = frog;
        amphibian.go();
    }
}
