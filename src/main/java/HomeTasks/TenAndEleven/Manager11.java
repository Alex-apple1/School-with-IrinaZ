package HomeTasks.TenAndEleven;

public class Manager11 extends Worker11 {

    private int numberOfSubordinates;
    int value;

    public Manager11(int baseSalary, String name, int numberOfSubordinates, int value) {
        super(baseSalary, name);
        this.numberOfSubordinates = numberOfSubordinates;
        this.value = value;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public final int getValue() {
        return value;
    }

    public double extraMoney() {
        double result = getBaseSalary() * (getNumberOfSubordinates() / 100.0 * getValue());
        return result;
    }

    @Override
    public int getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return super.getSalary();
        } else {
            double extraMoney = getBaseSalary() * (getNumberOfSubordinates() / 100.0 * getValue());
            return (int) (getBaseSalary() + extraMoney);
        }
    }
}
