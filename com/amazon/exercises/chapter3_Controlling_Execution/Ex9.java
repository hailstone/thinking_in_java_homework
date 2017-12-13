package exercises.chapter3_controlling_execution;

public class Ex9 {
    public static void main(String[] args) {
        getFib(13);
    }

    public static void getFib(int max) {
        int tmp;
        for (int i = 1, j = 1; i <= max; i = j, j = tmp + j) {
            tmp = i;
            System.out.println(i);
        }
    }
}
