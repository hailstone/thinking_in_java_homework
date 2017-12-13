package exercises.chapter4_initialization_and_cleanup;

public class Ex10 {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("this is the finalize statement");
        super.finalize();
    }

    public static void main(String[] args) {
        Ex10 ex = new Ex10();
        for (int i = 0; i < 100; i++) {
            new Ex10();
        }
    }
}
