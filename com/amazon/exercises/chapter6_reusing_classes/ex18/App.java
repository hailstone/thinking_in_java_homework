package exercises.chapter6_reusing_classes.ex18;

public class App {
    public static final int AGE = 22;
    public final int HEIGHT = 170;

    public static void main(String[] args) {
        System.out.println(AGE);
        System.out.println(new App().HEIGHT);
    }
}
