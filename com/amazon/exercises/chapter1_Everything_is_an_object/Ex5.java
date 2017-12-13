package exercises.chapter1_everything_is_an_object;

public class Ex5 {
    public static void main(String[] args) {
        DataOnly dataOnly = new DataOnly();
        dataOnly.i = 11;
        dataOnly.d = 2.2;
        dataOnly.b = false;
        
        System.out.println(dataOnly.i);
        System.out.println(dataOnly.d);
        System.out.println(dataOnly.b);
    }
}
