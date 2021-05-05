package HomeTasks.TenAndEleven;

public final class Manager11 extends BaseManager {

    private static final int VALUE = 3;

    public Manager11(int baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }

    @Override
    protected int getValue() {
        return VALUE;
    }

    public double extraMoney() {
        double result = getBaseSalary() * (getNumberOfSubordinates() / 100.0 * getValue());
        return result;
    }


}
