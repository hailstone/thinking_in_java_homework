package exercises.chapter4_initialization_and_cleanup;

public class Ex5 {
    public static void main(String[] args) {
        new Dog();
        new Dog("xiaowang");
        new Dog(5);
    }
}

class Dog {
    public Dog() {
        System.out.println("default bark");
    }

    public Dog(String s) {
        System.out.println(s + " is barking");
    }

    public Dog(int n) {
        System.out.println(n + " dog(s) is(are) barking");
    }
}
