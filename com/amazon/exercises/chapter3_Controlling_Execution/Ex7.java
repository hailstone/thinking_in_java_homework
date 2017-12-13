package exercises.chapter3_controlling_execution;

public class Ex7 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i == 99) {
                break;
            }
            System.out.println(i);
        }
    }
}
