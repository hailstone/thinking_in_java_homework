package exercises.chapter6_reusing_classes.ex2;

public class Lotion extends Cleanser {
    @Override
    public void scrub() {
        append(" Lotion.scrub()");
    }

    public void sterilize() {
        append(" sterilize()");
    }

    public static void main(String[] args) {

    }
}
