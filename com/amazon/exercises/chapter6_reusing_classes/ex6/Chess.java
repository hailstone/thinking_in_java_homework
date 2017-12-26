package exercises.chapter6_reusing_classes.ex6;

class Game {
    Game(int i) {
        System.out.println("game");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("boardGame");
    }

    BoardGame(int i, int j) {
        super(i);
        System.out.println("adfa");
    }
}

public class Chess extends BoardGame {
    Chess(int i) {
        super(i, 33);
        System.out.println("chess");
    }

    public static void main(String[] args) {
        new Chess(11);
    }
}
