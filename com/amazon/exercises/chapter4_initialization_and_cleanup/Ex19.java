package exercises.chapter4_initialization_and_cleanup;

public class Ex19 {
    public static void f(String... args) {
        for (String s : args) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        f("aa", "bb");
        f(new String[]{"cc", "dd"});
    }
}
