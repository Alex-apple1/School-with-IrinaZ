package PracticeIrinaZ.interfaces.School;

import static PracticeIrinaZ.School.Data.*;

public final class Teacher extends BasePerson implements ISalary {

    private String subject;
    private int set;
    private double code;

    public Teacher(String firstName, String lastName, char gender,
                   int age, String status, String subject, int set, double code) {
        super(firstName, lastName, gender, age, status);
        this.subject = subject;
        this.set = set;
        this.code = code;
    }

    public String getSubject() {
        return subject;
    }

    public void printTeacher() {
        System.out.println(
                "Teacher: " + getFirstName() + " " + getLastName() + ", subject: " +
                        getSubject());
    }

    @Override
    public double getBaseSalary() {
        double baseSalary = set * BASE_HOURS_SET * HOURLY_WAGE_PER_TEACHER;
        return baseSalary;
    }

    @Override
    public double getSalaryPerMonth() {
        double salaryPerMonth = getBaseSalary() * 4 + FOR_TC_PER_WEEK * 4;
        return salaryPerMonth;
    }

    @Override // дефолтный метод интерфейса можно не переписывать!
    public double getTaxes() {
        return getSalaryPerMonth() * 30/100;
    }

    @Override
    public double getSalary() {
        return getSalaryPerMonth() - getTaxes();

    }


}
