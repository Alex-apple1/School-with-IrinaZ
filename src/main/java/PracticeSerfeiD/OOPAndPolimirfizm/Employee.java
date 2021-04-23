package PracticeSerfeiD.OOPAndPolimirfizm;

public class Employee extends Person {

    private int salary;

    public Employee(String name, int age, char sex, int salary) {
        super(name, age, sex);
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
