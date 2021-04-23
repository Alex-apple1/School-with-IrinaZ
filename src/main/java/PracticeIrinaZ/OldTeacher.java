package PracticeIrinaZ;

public class OldTeacher {
    public static void main(String[] args) {

        String commaSpace = ", ";
        String space = " ";
        String line = "______________";

        String firstName1;
        String lastName1;
        int age1;
        String subject1;
        boolean isTeacher1 = true;
        boolean isStudent1 = false;

        String firstName2;
        String lastName2;
        int age2;
        String subject2;
        boolean isTeacher2 = true;
        boolean isStudent2 = false;

        firstName1 = "Мария Ивановна";
        lastName1 = "Петрова";
        age1 = 35;
        subject1 = "Russian Literature";

        firstName2 = "Иван Петрович";
        lastName2 = "Иванов";
        age2 = 55;
        subject2 = "Math";

        if (firstName1 == "Мария Ивановна"
                && age1 == 35
                && subject1 == "Russian Literature") {
            System.out.println(
                    firstName1 + space + lastName1 + commaSpace + age1 + commaSpace + subject1);

        } else if (subject2 == "Math") {
            System.out.println(
                    firstName2 + space + lastName2 + commaSpace + age2 + commaSpace + subject2);

        } else {
            System.out.println("ERROR!!!");
        }

        System.out.println(line);
        System.out.println("Выход из программы");
    }
}
