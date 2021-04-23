package HomeTasks;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        int sum = 0;
//                for (int i = 0; i < array.length; i++) {
////            sum += array[i];////
//        }
//        System.out.println(sum);


//        //        int max = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (max < array[i]) {
//                max = array[i];
//            }//
//        }//
//        System.out.println(max);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.print(min);
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int sum = 0;
//            for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        int middle = sum / array.length;
//        System.out.println(middle);

//        int[][] array = {{1, 2, 3, 4, 5},
//                {6, 7, 8, 9},
//                {-1, -2, -3, -4},
//                {-5, -6}};
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                    sum += array[i][j];
//            }
//        }
//        System.out.println(sum);
//        int maxValue = array[0][0];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j <array[i].length; j++) {
//
//                if (maxValue < array[i][j]) {
//                    maxValue = array[i][j];
//
//                }
//            }
//        }
//        System.out.println(maxValue);

    }

}
