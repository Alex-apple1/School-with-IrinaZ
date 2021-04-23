package PracticeSerfeiD.OOPAndPolimirfizm;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Alex", 40, 'M');
        Employee employee = new Employee("AA", 40, 'M', 100);
        Manager manager = new Manager("Anna", 30, 'F', 1000, 10);
        Director director = new Director("Alex", 40, 'M', 10000, 3);

//        System.out.println(person.getName());
//        System.out.println(employee.getName());
//        System.out.println(employee.getSalary());
//
//        System.out.println(manager.getName());
//        System.out.println(manager.getSalary());
//
//        System.out.println(director.getName());
//        System.out.println(director.getSalary());

        Employee[] employeeArray = new Employee[]{employee, manager, director};

        System.out.println(EmployeeUtils.getSum(employeeArray));
        System.out.println(EmployeeUtils.findByName("Sergey", employeeArray));

    }
}
