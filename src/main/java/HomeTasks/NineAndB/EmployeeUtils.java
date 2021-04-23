package HomeTasks.NineAndB;

import java.util.Objects;

public class EmployeeUtils {

    static int getSum(Employee[] employeeArray) {
        int result = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            result += employeeArray[i].getSalary();
        }
        return result;
    }

    static Employee findByName (String name, Employee[] employeeArray) {
        for (int i = 0; i < employeeArray.length; i++) {
            if (Objects.equals(name, employeeArray[i].getName())) {
                return employeeArray[i];
            }
        }
        return null;
    }

    static boolean find (Employee employee, Employee[] employeeArray) {
        for (int i = 0; i < employeeArray.length; i++) {
            if (employee == employeeArray[i]) {
                return true;
            }
        }
        return false;
    }

    static Employee getMinSalary(Employee[] employeeArray) {
        Employee result = employeeArray[0];
        for (int i = 1; i < employeeArray.length; i++) {
            if (result.getSalary() > employeeArray[i].getSalary()) {
                result = employeeArray[i];
            }
        }
        return result;
    }

    static Employee getMaxSalary(Employee[] employeeArray) {
        Employee result = employeeArray[0];
        for (int i = 1; i < employeeArray.length; i++) {
            if (result.getSalary() < employeeArray[i].getSalary()) {
                result = employeeArray[i];
            }
        }
        return result;
    }

    public static String getName(String name, char sex) {
        if (sex == 'M') {
            return "Mr. " + name;
        } else return "Mrs. " + name;
    }


}
