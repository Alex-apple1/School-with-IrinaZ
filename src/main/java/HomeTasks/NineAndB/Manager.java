package HomeTasks.NineAndB;

public class Manager extends Employee{

    private int workerCount;

    public Manager(String name, int age, char sex, int salary, int workerCount) {
        super(name, age, sex, salary);
        this.workerCount = workerCount;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + (int)(super.getSalary() * workerCount / 100.0);
    }

    protected int getBaseSalary() {
        return super.getSalary();
    }

    public int getWorkerCount() {
        return workerCount;
    }

    public void setWorkerCount(int workerCount) {
        this.workerCount = workerCount;
    }
}
