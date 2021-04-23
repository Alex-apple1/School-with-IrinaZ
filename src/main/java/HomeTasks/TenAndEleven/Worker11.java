package HomeTasks.TenAndEleven;

public class Worker11 extends Employee11 {

    public Worker11(int baseSalary, String name) {
        super(baseSalary, name);
    }

    @Override
    public int getSalary() {
        return 0;
    }

    @Override
    public final int getBaseSalary() {
        return super.getBaseSalary();
    }
}
