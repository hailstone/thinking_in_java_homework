package exercises.chapter6_reusing_classes.ex12;

public class Root {
    Component1 c1;
    Component2 c2;
    Component3 c3;

    Root() {
        c1 = new Component1();
        c2 = new Component2();
        c3= new Component3();
    }

    public void dispose() {
        System.out.println("root dispose");
    }

    public static void main(String[] args) {

    }
}

class Stem extends Root {
    Component1 c1;
    Component2 c2;
    Component3 c3;

    Stem() {
        c1 = new Component1();
        c2 = new Component2();
        c3= new Component3();
    }

    @Override
    public void dispose() {
        System.out.println("stem dispose");
        c1.dispose();
        c2.dispose();
        c3.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        new Stem();
    }
}

class Component1 {
    Component1() {
        System.out.println("compenent1");
    }

    public void dispose() {
        System.out.println("c1 dispose");
    }
}

class Component2 {
    Component2() {
        System.out.println("compenent2");
    }

    public void dispose() {
        System.out.println("c2 dispose");
    }
}

class Component3 {
    Component3() {
        System.out.println("compenent3");
    }

    public void dispose() {
        System.out.println("c3 dispose");
    }
}