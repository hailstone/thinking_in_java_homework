package exercises.chapter5_access_control.ex6;

public class Ex6 {
    protected int data;
}

class Test {
    public static void main(String[] args) {
        new Ex6().data = 11;
    }
}
