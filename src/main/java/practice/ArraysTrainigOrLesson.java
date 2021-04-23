package practice;

import java.util.Arrays;

public class ArraysTrainigOrLesson {
    public static void main(String[] args) {
        int[] x = {10, 20};

        int[][] a = { x, {50, 70}, {80, 90} };

        System.out.println(Arrays.deepToString(a));

        x[0] = 30;
        x[1] = 31;
        System.out.println(Arrays.deepToString(a));
    }
}
