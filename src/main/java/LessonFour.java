import java.util.Arrays;

public class LessonFour {

    public static void main(String[] args) {
////
//        int[] arr = {1, 2, 3, 47, 5, 6, -77, 8};
////        int[] arr = new int[1];
////        int max = arr[0];
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (max < arr[i]) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(Arrays.toString(arr));

//        int[] x = {10, 20};
//
//        int[][] a = {x, {30, 40}, {80, 90}};
//        System.out.println(Arrays.deepToString(a));

//        x[0] = 30;
//        x[1] = 31;

//        System.out.println(Arrays.toString(b));

//        for (int i = 0; i < 10;) {
//            i = i++;
//            System.out.println("Hello, Wowa!");

      int alpha = 11;
      int beta = 3;
      int newA = alpha / beta;
      int newB = alpha % beta;
      int result = newB + newA * beta;
        System.out.println(result);
    }
}
