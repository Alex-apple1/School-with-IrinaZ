package HomeTasks.TenAndEleven.Ten;

public final class Month {
    private final String monthName;
    private final int quantityOfDays;
    private final int quantityOfWorkingDays;

    public Month(String monthName, int quantityOfDays,
                 int quantityOfWorkingDays) {
        this.monthName = monthName;
        this.quantityOfDays = quantityOfDays;
        this.quantityOfWorkingDays = quantityOfWorkingDays;
    }

    public final String getMonthName() {
        return monthName;
    }

//    public void setMonthName(String monthName) {
//        this.monthName = monthName;
//    }

    public final int getQuantityOfDays() {
        return quantityOfDays;
    }

//    public void setQuantityOfDays(int quantityOfDays) {
//        this.quantityOfDays = quantityOfDays;
//    }

    public final int getQuantityOfWorkingDays() {
        return quantityOfWorkingDays;
    }

//    public void setQuantityOfWorkingDays(int quantityOfWorkingDays) {
//        this.quantityOfWorkingDays = quantityOfWorkingDays;
//    }
}
