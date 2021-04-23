package PracticeStanA.oop;

public class Employee extends Person {

    String motherFucker;

    public Employee() {
        System.out.println("Employee 1st constructor");
    }

    public Employee(String name, int age, String gender) {
        super(name, age);
        System.out.println("Employee 2nd constructor");
    }
}