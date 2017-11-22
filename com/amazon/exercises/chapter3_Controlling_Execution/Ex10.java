package exercises.chapter3_Controlling_Execution;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex10 {
    public static void main(String[] args) {
        System.out.println(getAllPerm("abc"));

        for (int num = 1000; num < 10000; num++) {
            if (num % 100 == 0) {
//                System.out.println("has more than one zero at the end, continue");
                continue;
            }

            String s = String.valueOf(num);
            label:
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < s.length(); j++) {
                    for (int k = 0; k < s.length(); k++) {
                        for (int l = 0; l < s.length(); l++) {
                            if (i == j || i == k || i == l || j == k || j == l || k == l) {
                                continue;
                            }

                            int firstNum = Integer.parseInt((String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(j))));
                            int secondNum = Integer.parseInt((String.valueOf(s.charAt(k)) + String.valueOf(s.charAt(l))));

                            if (num == firstNum * secondNum) {
                                System.out.println(String.format("%d * %d = %d", firstNum, secondNum, num));
                                break label;
                            }
                        }
                    }
                }
            }
        }
    }

    public static ArrayList<String> getAllPerm(String s) {
        if (s.length() == 0) {
            return new ArrayList<String>();
        }

        if (s.length() == 1) {
            ArrayList<String> al = new ArrayList<String>();
            al.add(s);
            return al;
        }

        ArrayList<String> tmp = new ArrayList<>();
        for (String element : getAllPerm((s.substring(1)))) {
            for (int i = 0; i <= element.length(); i++) {
                System.out.println(element + " : " + i);
                tmp.add(element.substring(0, i) + s.charAt(0) + element.substring(i));
            }
        }
        return tmp;
    }
}
