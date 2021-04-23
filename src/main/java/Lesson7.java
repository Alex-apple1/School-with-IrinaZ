import java.util.Arrays;

public class Lesson7 {

        public static boolean isZero(int number) {
        if (number == 0) {
            System.out.println("Bitch you are!");
            return true;
        } else {
            System.out.println("Suck my dick!");
            return false;
        }
        }

//    public static String[] getName() {
//        String firstName = "Anna";
//        String lastName = "Apple";
//        String[] fullName = {firstName, lastName};
//        return fullName;
//    }
//
//    public static void greeting(String firstName, String lastName) {
//        System.out.println("Hallo, " + firstName + " " + lastName + "!");
//        System.out.println("Welcome to our site.");
//    }

    public static void main(String[] args) {
        System.out.println(isZero(3));
        System.out.println(isZero(0));
//        String[] name = getName();
//        System.out.println(Arrays.toString(name));
//        greeting(name[0], name[1]);
    }

}