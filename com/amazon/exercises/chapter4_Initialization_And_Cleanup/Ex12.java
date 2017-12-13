package exercises.chapter4_initialization_and_cleanup;

public class Ex12 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Tank tank = new Tank();
            tank.fillTank();
        }
        System.gc();
    }
}

class Tank {
    private boolean isEmpty = true;

    public void fillTank() {
        isEmpty = false;
    }

    public void emptyTank() {
        isEmpty = true;
    }

    @Override
    protected void finalize() throws Throwable {
        if (!isEmpty) {
            System.out.println("the tank is not empty");
        }
        super.finalize();
    }
}
