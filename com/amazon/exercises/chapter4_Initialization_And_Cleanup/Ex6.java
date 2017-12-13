package exercises.chapter4_initialization_and_cleanup;

public class Ex6 {
    public static void main(String[] args) {
        new Dogg(6, "fighting");
        new Dogg("playing", 33);
    }
}

class Dogg {
    public Dogg(int n, String s) {
        System.out.println(n + " dogs are " + s);
    }

    public Dogg(String s, int n) {
        System.out.println(String.format("there are %d dogs are %s", n, s));
    }
}
