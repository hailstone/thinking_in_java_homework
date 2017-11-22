package exercises.chapter3_Controlling_Execution;

public class Ex6 {
    public static void main(String[] args) {
        test(4,1,11);
        test(4,11,22);
    }

    static void test(int testval, int begin, int end) {
        if (testval >= begin && testval <= end) {
            System.out.println("in the range");
        } else {
            System.out.println("out of the range");
        }
    }
}
