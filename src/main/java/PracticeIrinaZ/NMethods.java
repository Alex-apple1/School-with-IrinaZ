package PracticeIrinaZ;

public class NMethods {


    public static String checkAge(int age) {
        if (age >= 0 && age < 16){
            return "Sorry, you`re too young!";
        } else if (age >= 16 && age < 18) {
            return "You can drive a car!";
        } else if (age >= 18 && age < 21) {
            return "you can buy a lottery ticket!";
        } else if (age >= 21) {
            return "You can go and fuck yourself!";
        } else return null;
    }

    public static void printcheckAge(int age) {
        if (age >= 0 && age < 16){
            System.out.println("Sorry, you`re too young!");
        } else if (age >= 16 && age < 18) {
            System.out.println("You can drive a car!");
        } else if (age >= 18 && age < 21) {
            System.out.println("You can buy a lottery ticket!");
        } else if (age >= 21) {
            System.out.println("You can go and fuck yourself!");
        }
    }


    public static void main(String[] args) {
        int age = 200;

        System.out.println(checkAge(age));
        printcheckAge(age);
    }
}
