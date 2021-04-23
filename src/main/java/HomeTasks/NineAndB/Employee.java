package HomeTasks.NineAndB;

public class Employee extends Person{

    private int salary;

    public Employee(String name, int age, char sex, int salary) {
        super(name, age, sex);
        this.salary = salary;
    }
    @Override
    public String getName() {
        return getBaseName();
    }

    public int getSalary() {
        return salary;
    }

}
