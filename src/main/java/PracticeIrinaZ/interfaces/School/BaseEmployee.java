package PracticeIrinaZ.interfaces.School;

public abstract class BaseEmployee extends BasePerson {

    private double salary;

    BaseEmployee(String firstName, String lastName, char gender,
                 int age, String status, double salary) {
        super(firstName, lastName, gender, age, status);
        this.salary = salary;
    }

    public abstract double getSalary();

    public abstract double getTaxes();
}
