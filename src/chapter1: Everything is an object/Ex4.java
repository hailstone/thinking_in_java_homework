public class Ex4 {
    public static void main(String[] args) {
        DataOnly dataOnly = new DataOnly();
        System.out.println(dataOnly.i);
        System.out.println(dataOnly.d);
        System.out.println(dataOnly.b);
    }
}

class DataOnly {
    int i;
    double d;
    boolean b;
}
