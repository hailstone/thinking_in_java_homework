package exercises.chapter5_access_control.ex8;

public class ConnectionManager {
    public static int count = 0;
    public static int max = 3;

    public static Connection createConnectionObject() {
        if (count >= max) {
            return null;
        }
        count++;
        return new Connection(count);
    }

    public static void main(String[] args) {
        System.out.println(createConnectionObject().i);
        System.out.println(createConnectionObject().i);
        System.out.println(createConnectionObject().i);
        System.out.println(createConnectionObject().i);
    }
}

class Connection {
    int i;

    public Connection(int i) {
        this.i = i;
    }
}
