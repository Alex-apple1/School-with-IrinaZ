package HomeTasks.TenAndEleven;

import java.util.Objects;

public class EmployeeHelper {

    //    поиск сотрудника в массиве по его имени
    public static Employee11 findByName(String name, Employee11[] employee11s) {
        for (int i = 0; i < employee11s.length; i++) {
            if (Objects.equals(name, employee11s[i].getName())) {
                return employee11s[i];
            }
        }
        return null;
    }

//    public static Employee11 findBySubstringInTheName(String name, Employee11[] employee11s) {
//        for (int i = 0; i < employee11s.length; i++) {
//            if (Objects.equals(name, employee11s[i].getName())) {
//                return employee11s[i];
//            }
//        }
//        return null;
//    }

    //подсчет зарплатного бюджета для всех сотрудников в массиве
    public static int getSalarySum(Employee11[] employee11s) {
        int result = 0;
        for (int i = 0; i < employee11s.length; i++) {
            result += employee11s[i].getSalary();
        }
        return result;
    }

    //    поиск наименьшей зарплаты в массиве
    public static Employee11 getMinSalaryInArray(Employee11[] employee11s) {
        Employee11 result = employee11s[0];
        for (int i = 1; i < employee11s.length; i++) {
            if (result.getSalary() > employee11s[i].getSalary()) {
                result = employee11s[i];
            }
        }
        return result;
    }

    //    поиск наибольшей зарплаты в массиве
    public static Employee11 getMaxSalaryInArray(Employee11[] employee11s) {
        Employee11 result = employee11s[0];
        for (int i = 1; i < employee11s.length; i++) {
            if (result.getSalary() < employee11s[i].getSalary()) {
                result = employee11s[i];
            }
        }
        return result;
    }

    //    поиск наименьшего количества подчиненных в массиве менеджеров
    public static Manager11 getMinQuantityOfSubordinatesInArray(Manager11[] manager11s) {
        Manager11 result = manager11s[0];
        for (int i = 1; i < manager11s.length; i++) {
            if (result.getNumberOfSubordinates() > manager11s[i].getNumberOfSubordinates()) {
                result = manager11s[i];
            }
        }
        return result;
    }

    //    поиск наибольшего количества подчиненных в массиве менеджеров
    public static Manager11 getMaxQuantityOfSubordinatesInArray(Manager11[] manager11s) {
        Manager11 result = manager11s[0];
        for (int i = 1; i < manager11s.length; i++) {
            if (result.getNumberOfSubordinates() < manager11s[i].getNumberOfSubordinates()) {
                result = manager11s[i];
            }
        }
        return result;
    }

//    поиск наименьшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
    public static Manager11 getMinExtraSalaryInArray(Manager11[] manager11s) {
        Manager11 result = manager11s[0];
        for (int i = 1; i < manager11s.length; i++) {
            if (result.extraMoney() > manager11s[i].extraMoney()) {
                result = manager11s[i];
            }
        }
        return result;
    }

    //    поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
    public static Manager11 getMaxExtraSalaryInArray(Manager11[] manager11s) {
        Manager11 result = manager11s[0];
        for (int i = 1; i < manager11s.length; i++) {
            if (result.extraMoney() < manager11s[i].extraMoney()) {
                result = manager11s[i];
            }
        }
        return result;
    }

}
