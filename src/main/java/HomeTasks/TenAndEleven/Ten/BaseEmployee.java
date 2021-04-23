package HomeTasks.TenAndEleven.Ten;

public abstract class BaseEmployee {
    private String name;
    private int age;
    private char sex;
    private int salaryADay;

    public BaseEmployee(String name, int age, char sex, int salaryADay) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salaryADay = salaryADay;
    }

    public int getSalary(Month[] monthArray) {
        int result = 0;
        for (int i = 0; i < monthArray.length; i++) {
            result += monthArray[i].getQuantityOfWorkingDays() * this.getSalaryADay();
        }
        return result;
    }

    public int getSalaryADay() {
        return salaryADay;
    }

    public void setSalaryADay(int salaryADay) {
        this.salaryADay = salaryADay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
