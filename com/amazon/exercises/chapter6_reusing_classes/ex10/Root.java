package exercises.chapter6_reusing_classes.ex10;

public class Root {
    Component1 c1;
    Component2 c2;
    Component3 c3;

    Root(int i) {
        c1 = new Component1(22);
        c2 = new Component2(22);
        c3= new Component3(22);
    }

    public static void main(String[] args) {

    }
}

class Stem extends Root {
    Component1 c1;
    Component2 c2;
    Component3 c3;

    Stem(int i) {
        super(i);
        c1 = new Component1(11);
        c2 = new Component2(11);
        c3= new Component3(11);
    }

    public static void main(String[] args) {
        new Stem(11);
    }
}

class Component1 {
    Component1(int i) {
        System.out.println("compenent1");
    }
}

class Component2 {
    Component2(int i) {
        System.out.println("compenent2");
    }
}

class Component3 {
    Component3(int i) {
        System.out.println("compenent3");
    }
}