package HomeTasks.NineAndB;

public class Director extends Manager{
    public Director(String name, int age, char sex, int salary, int workerCount) {
        super(name, age, sex, salary, workerCount);
    }

    @Override
    public int getSalary() {
        return getBaseSalary() + (int)(getBaseSalary() * (getWorkerCount() / 500.0));
    }

    @Override
    public String getName() {
        return EmployeeUtils.getName(super.getName(), getSex());
    }
}
