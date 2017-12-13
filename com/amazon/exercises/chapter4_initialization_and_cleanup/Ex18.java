package exercises.chapter4_initialization_and_cleanup;

public class Ex18 {
    public Ex18(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        Ex18[] arr = new Ex18[11];
        arr[0] = new Ex18("aa");
        arr[1] = new Ex18("bb");
        System.out.println(new int[10].getClass());
    }
}
