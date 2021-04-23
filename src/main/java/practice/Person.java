package practice;

import java.util.Scanner;

public class Person {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your first number");
//        int num1 = scan.nextInt();
//
//        System.out.println("Enter your operator");
//        String operator = scan.next();
//
//        System.out.println("Enter your second number");
//        int num2 = scan.nextInt();
//
//        if (operator.equals("+")) {
//            System.out.println(num1 + num2);
//        } else if (operator.equals("-")) {
//            System.out.println(num1 - num2);
//        } else if (operator.equals("*")) {
//            System.out.println(num1 * num2);
//        } else if (operator.equals("/")) {
//            System.out.println(num1 / num2);
//        } else System.out.println("Wrong operator");
//            scan.close();

//        Scanner scan = new Scanner(System.in);
//        boolean snow, rain, sunny;
//        int temp;
//        String activity;
//
//        System.out.println("Enter temperature");
//        temp = scan.nextInt();
//
//        if (temp >= 40 && temp < 80) {
//            System.out.println("Is it raining?");
//            rain = scan.nextBoolean();
//            if (rain) {
//                activity = "watch a movie";
//            } else {
//                activity = "go for a walk";
//            }
//        } else if (temp >= 25 && temp < 40) {
//            System.out.println("Is it snowing?");
//            snow = scan.nextBoolean();
//            if (snow) {
//                activity = "make snowwoman";
//            } else {
//                activity = "learn Java";
//            }
//        } else if (temp >= 80) {
//            System.out.println("Is it sunny?");
//            sunny = scan.nextBoolean();
//            if (sunny) {
//                activity = "Go to the beaches";
//            } else {
//                activity = "Learn Java";
//            }
//        } else {
//            activity = "Please provide valid temp";
//            activity = "Unknown";
//        }
//        System.out.println("Your activity: " + activity);


        Scanner input = new Scanner(System.in);

        System.out.println("Do you have a credit card? true or false?");
        Boolean  cc = input.nextBoolean();

        if (cc == true) {
            System.out.println("What is the balance on your card?");
            int balance = input.nextInt();
            if (balance < 100) {
                System.out.println("Please top up your balance");
            } else {
                System.out.println("You can spend more money");
            }
        } else {
            System.out.println("Would you like to apply for a cc?");
        }


    }
}
