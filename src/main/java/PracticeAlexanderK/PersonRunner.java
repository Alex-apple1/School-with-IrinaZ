package PracticeAlexanderK;

public class PersonRunner {

    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.setLastName("Kazakov");

        Person p2 = new Person("Booba", "Kastorsky", "male");

//        Person p3 = new Person("Mary", "Zhoppins", "female", 1989, 8, 27);
//        System.out.println(p3.getAge());

        System.out.println(Person.planetOfOrigin);
//        Person.planetOfOrigin = "Mars";
        System.out.println(Person.planetOfOrigin);
        System.out.println("Population of "
                + Person.planetOfOrigin + ": " + Person.getPopulation());
//        System.out.println(p1);
    }
}
