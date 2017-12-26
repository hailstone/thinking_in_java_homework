package exercises.chapter6_reusing_classes;

public class Ex1 {
    private static Test test;

    public static Test getInstance() {
        if (test == null) {
           test = new Test();
        }
        return test;
    }
    public static void main(String[] args) {
        getInstance();
        getInstance();
        getInstance();
    }
}

class Test {
    int data;

    public Test() {
        System.out.println("create a new instance");
    }
}
