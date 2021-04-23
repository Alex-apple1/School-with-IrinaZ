package practice;

import java.util.Arrays;

public class ArrayLoopString {
    public static void main(String[] args) {

//        int[] a = {200, 85, 70, 95};
//        int target = 180;
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length; j++) {
//                if (a[i] + a[j] == target) {
//                    System.out.println(a[i ]);
//                }
//            }
//        }

//        String s = "Hello World";
//        System.out.println(s);

//        char[] helloWorld = {'H', 'e', 'l', 'l', 'o', ' ',
//                'W', 'o', 'r', 'l', 'd'};
//        System.out.println(Arrays.toString(helloWorld));
//        String helloString = new String(helloWorld);
//        System.out.println(helloString);
        String s = "Hello World";
        System.out.println(s);

        int dlina = s.length();
        System.out.println(dlina);

        char result = s.charAt(4);
        System.out.println(result);

        System.out.println(s.indexOf('d'));
    }
}
