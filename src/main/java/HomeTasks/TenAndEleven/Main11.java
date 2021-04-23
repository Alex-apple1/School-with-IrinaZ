package HomeTasks.TenAndEleven;

public class Main11 {
    public static void main(String[] args) {

        Manager11 manager11 = new Manager11(
                100, "Anna", 10, 3);
        Manager11 manager2 = new Manager11(
                200, "Serg", 15, 3);
        Director11 director11 = new Director11(
                100, "Alex", 10, 9);

        Employee11[] employee11s = {manager11, director11};
        Manager11[] manager11s = {manager11, manager2};

//        System.out.println(EmployeeHelper.findByName("Alex", employee11s));
        System.out.println(manager11.getSalary());
        System.out.println(director11.getSalary());
        System.out.println(EmployeeHelper.getSalarySum(employee11s));
        System.out.println(EmployeeHelper.getMinSalaryInArray(employee11s));
        System.out.println(EmployeeHelper.getMaxSalaryInArray(employee11s));
        System.out.println();

        System.out.println(EmployeeHelper.getMinQuantityOfSubordinatesInArray(manager11s));
        System.out.println(EmployeeHelper.getMaxQuantityOfSubordinatesInArray(manager11s));
        System.out.println();

        System.out.println(EmployeeHelper.getMinExtraSalaryInArray(manager11s));
        System.out.println(EmployeeHelper.getMaxExtraSalaryInArray(manager11s));

    }
}
