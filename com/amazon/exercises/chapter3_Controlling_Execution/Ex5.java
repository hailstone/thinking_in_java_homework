package exercises.chapter3_Controlling_Execution;

public class Ex5 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        for (int i = 334243; i != 0; i /= 2) {
            sb.insert(0, i % 2 == 0 ? 0 : 1);
        }
        System.out.println(sb);
    }
}
