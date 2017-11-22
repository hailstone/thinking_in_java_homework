package exercises.chapter3_Controlling_Execution;

public class Ex8 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            switch (i) {
                case 1:
                    System.out.println("case 1: " + i);
                    break;
                case 2:
                    System.out.println("case 2: " + i);
                    break;
                case 3:
                    System.out.println("case 3: " + i);
                    break;
                default:
                    System.out.println("other: " + i);
            }
        }
    }
}
