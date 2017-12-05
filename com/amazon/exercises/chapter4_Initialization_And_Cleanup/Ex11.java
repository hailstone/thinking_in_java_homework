package exercises.chapter4_Initialization_And_Cleanup;

public class Ex11 {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("this is the finalize statement");
        super.finalize();
    }

    public static void main(String[] args) {
        Ex11 ex = new Ex11();
        for (int i = 0; i < 100; i++) {
            new Ex11();
        }
        System.gc();
        System.gc();
    }
}
