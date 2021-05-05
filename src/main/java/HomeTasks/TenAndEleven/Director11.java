package HomeTasks.TenAndEleven;

public final class Director11 extends BaseManager {

    private static final int VALUE = 9;

    public Director11(int baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }

    @Override
    protected int getValue() {
        return VALUE;
    }
}
