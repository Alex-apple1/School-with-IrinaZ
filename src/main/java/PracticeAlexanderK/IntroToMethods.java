package PracticeAlexanderK;

public class IntroToMethods {
    public static void main(String[] args) {

        simpleMethod1();

        String result = simpleMethod2();
        System.out.println(result);

        String resultOfMethod3 = simpleMethod3("Friday");
        System.out.println("I am back from method3: " + resultOfMethod3);

        System.out.println(powerOf2(4));

//        System.out.println(isEven(4));
//        System.out.println(isEven(5));
//        System.out.println(isEven(7));

        System.out.println(hasElement(new int[] {1, 2, 3, 4, 5}, 4));

    }

    public static void simpleMethod1() {
        System.out.println("Some shit inside method 1");
    }

    public static String simpleMethod2() {
        System.out.println("Some shit inside method 2");
        int qool = 123;
        return "I am back from hell!";
    }

    public static String simpleMethod3(String dayOfTheWeek) {
        System.out.println("Today is " + dayOfTheWeek);
        return dayOfTheWeek;
    }

    public static int powerOf2(int param1) {
        return param1 * param1;
    }

    public static boolean isEven(int value) {
        boolean result = value % 2 == 0;
        return result;
    }

    public static boolean hasElement(int[] array, int value) {
        boolean hasFound = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                hasFound = true;
                break;
            }

        }
        return hasFound;
    }
}
