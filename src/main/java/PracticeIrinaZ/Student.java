package PracticeIrinaZ;

public class Student {
    public static void main(String[] args) {

        String commaSpace = ", ";
        String space = " ";
        String line = "______________";

        String firstName1 = "Маша";
        String lastName1 = "Сидорова";
        int age1 = 10;
        String grade1 = "5 класс";
        boolean isTeacher1 = false;
        boolean isStudent1 = true;

        String firstName2 = "Вова";
        String lastName2 = "Наумов";
        int age2 = 7;
        String grade2 = "1 класс";
        boolean isTeacher2 = false;
        boolean isStudent2 = true;

        System.out.println(
                firstName1 + space + lastName1 + commaSpace + age1 + commaSpace + grade1);
        System.out.println(
                firstName2 + space + lastName2 + commaSpace + age2 + commaSpace + grade2);


    }
}
