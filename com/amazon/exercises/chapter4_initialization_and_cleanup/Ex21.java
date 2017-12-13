package exercises.chapter4_initialization_and_cleanup;

public class Ex21 {
    public static void main(String[] args) {
        for (Currency currency : Currency.values())
        System.out.println(currency.ordinal());
    }
}

enum Currency {
    RENMINBI, DOLLAR;
}