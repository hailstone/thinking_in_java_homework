package exercises.chapter1_Everything_is_an_object;

public class Ex6 {
    public static void main(String[] args) {
        App a = new App();
        String s = "test";
        System.out.println(a.storage(s));
    }
}

class App {
    int storage(String s) {
        return s.length() * 2;
    }
}
