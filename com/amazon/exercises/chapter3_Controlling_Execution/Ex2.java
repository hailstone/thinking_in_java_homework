package exercises.chapter3_controlling_execution;

import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        int rand = new Random().nextInt();
        for (int i = 0; i < 25; i++) {
            int newRand = new Random().nextInt();
            System.out.println("the rand is: " + rand);
            if (rand > newRand) {
                System.out.println("it's greater than the next one");
            } else if (rand < newRand) {
                System.out.println("it's less than the next one");
            } else {
                System.out.println("it's equal to the next one");
            }
            rand = newRand;
        }
    }
}
