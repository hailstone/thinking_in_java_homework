package exercises.chapter6_reusing_classes.ex9;

public class Root {
    Component1 c1;
    Component2 c2;
    Component3 c3;

    Root() {
        c1 = new Component1();
        c2 = new Component2();
        c3= new Component3();
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

    public static void main(String[] args) {
        new Stem();
    }
}

class Component1 {
    Component1() {
        System.out.println("compenent1");
    }
}

class Component2 {
    Component2() {
        System.out.println("compenent2");
    }
}

class Component3 {
    Component3() {
        System.out.println("compenent3");
    }
}