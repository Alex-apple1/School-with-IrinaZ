package HomeTasks.TenAndEleven.Ten;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Alex", 40, 'M', 100);
        Manager manager = new Manager("Alex", 40, 'M', 100, 10);

        System.out.println(employee.getSalary(MonthUtils.getQ1()));

        System.out.println(manager.getSalary(new Month[]{MonthUtils.jan}));

        System.out.println(employee.getSalary(MonthUtils.getQ2()));

        System.out.println(employee.getSalary(MonthUtils.getHalf1()));


    }
}
