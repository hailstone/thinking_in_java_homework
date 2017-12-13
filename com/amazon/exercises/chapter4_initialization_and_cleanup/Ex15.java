package exercises.chapter4_initialization_and_cleanup;

public class Ex15 {
    String s;
    {
        s = "ss";
    }

    public static void main(String[] args) {
        System.out.println(new Ex15().s);
    }
}
