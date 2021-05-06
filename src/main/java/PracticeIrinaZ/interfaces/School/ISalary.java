package PracticeIrinaZ.interfaces.School;

public interface ISalary {

    int BASE_HOURS_SET = 18;
    int TEACHER_COUNSELOR = 1;
    int TEACHER_TUTOR = 2;
    double FOR_TC_PER_WEEK = 50;
    double HOURLY_WAGE_PER_TEACHER = 40;
    double TAX_PERCENTAGE = 0.3;

    double getBaseSalary();
    double getSalaryPerMonth();
    double getSalary();
    default double getTaxes() {
        return getSalaryPerMonth() * TAX_PERCENTAGE;
    };


}
