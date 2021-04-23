public class Test {
    public static void main(String[] args) {
        String name = " Alex ";
        String lastName = " Apple ";
        String yearOfStudies = " 3 ";
        String age = " 40 ";

        System.out.println("Я студент" + name + lastName + "учусь на курсе "
                + yearOfStudies + "и мне" + age + "лет");

        double a = 3.5;
        double b = a * a;

        System.out.println("Квадрат числа " + a + " будет равен " + b);

        double c = 3.5;
        System.out.println("Корень квадратный из числа " +
                a + " равен " + Math.sqrt(c));

        int d = 2;
        d *= d;
        System.out.println(d);

        int x = 22, y = 10;
        String q = "Hello", w = "Bye";

        System.out.println(x + q + y + w + "\n"
                + x + x + "\n"
                + q + y + w);
    }
}
