package exercises.chapter3_controlling_execution;

public class Ex4 {
    public static void main(String[] args) {
        for (int i = 1; i < 10000; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("prime number: " + i);
            }
        }
    }
}
