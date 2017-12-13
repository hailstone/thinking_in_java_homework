package exercises.chapter4_initialization_and_cleanup;

public class Ex22 {
    public static void main(String[] args) {
        switch (PaperCurrency.THREE) {
            case ONE:
                System.out.println("one");
                break;
            case TWO:
                System.out.println("two");
                break;
            case THREE:
                System.out.println("three");
                break;
            case FOUR:
                System.out.println("four");
                break;
            default:
                System.out.println("the default one");
        }
    }
}

enum PaperCurrency {
    ONE, TWO, THREE, FOUR;
}