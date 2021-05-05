package HomeTasks.TenAndEleven;

public abstract class BaseManager extends Worker11{

    private int numberOfSubordinates;

    public BaseManager(int baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    protected abstract int getValue();

    public int getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return super.getSalary();
        } else {
            double extraMoney = getBaseSalary() * (getNumberOfSubordinates() / 100.0 * getValue());
            return (int) (getBaseSalary() + extraMoney);
        }
    }
}
