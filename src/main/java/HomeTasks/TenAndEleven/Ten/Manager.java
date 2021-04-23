package HomeTasks.TenAndEleven.Ten;

public final class Manager extends BaseEmployee {
    private int quantityOfSubordinates;

    Manager(String name, int age, char sex, int salaryADay, int quantityOfSubordinates) {
        super(name, age, sex, salaryADay);
        this.quantityOfSubordinates = quantityOfSubordinates;
    }

    @Override
    public int getSalary(Month[] monthArray) {
        int result = super.getSalary(monthArray);

        result += result * getQuantityOfSubordinates()/100;

        return result;
    }

    public int getQuantityOfSubordinates() {
        return quantityOfSubordinates;
    }

    public void setQuantityOfSubordinates(int quantityOfSubordinates) {
        this.quantityOfSubordinates = quantityOfSubordinates;
    }
}
