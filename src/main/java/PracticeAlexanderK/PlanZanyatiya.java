package PracticeAlexanderK;

public class PlanZanyatiya {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(args));
//
//        boolean callMethodAgain = false;
//
//        if (args.length == 0) {
//            callMethodAgain = true;
//        }

//        if (callMethodAgain) {
//            String[] arg = new String[]{"First argument", "Second argument"};
//            PlanZanyatiya.main(arg);
//        }

        powerOf2(2);
        System.out.println(powerOf2(5));

        System.out.println("After method completion");

        System.out.println("________________________________");

        System.out.println(powerOf(2, 3));
        System.out.println(powerOf(6));
        System.out.println(powerOf("5"));
    }

    public static int powerOf2(int number) {
        int result = 0;
        result = number * number;
//        System.out.println(result);
        return result;
    }

    public static int powerOf(String numberAsString) {
        int number = Integer.parseInt(numberAsString);
        return powerOf2(number);
    }

    public static int powerOf(int number) {
        return powerOf2(number);
    }

    public static int powerOf(int number, int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        return result;
    }
}
