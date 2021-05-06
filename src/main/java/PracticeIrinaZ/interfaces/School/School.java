package PracticeIrinaZ.interfaces.School;


import static PracticeIrinaZ.interfaces.School.tests.Assert.aAssert;
import static PracticeIrinaZ.interfaces.School.ISalary.FOR_TC_PER_WEEK;

public class School {

    private static final String LINE = "___________________________________";
    private static final double EXPECTED_BASE_SALARY = 1440;
    private static final double EXPECTED_PAY_CHECK = 4172;

    public static void main(String[] args) {

        Student student1 = new Student("Masha", "Ivanova",
                'F', 10, "Student", 5);

        Student student2 = new Student("Vova", "Sidorov",
                'M', 14, "Student",8);

        System.out.println(student1.getGender());

        Parent parent1 = new Parent("Petr", "Ivanov", 'M',
                45, "Parent", 12345678911L, student1);

        Parent parent2 = new Parent("Elena", "Ivanov", 'F',
                40, "Parent", 12345678912L, student1);

        Parent parent3 = new Parent("Andrey", "Sidorov",
                'M', 35, "Parent", 12345675555L, student2);

        Teacher teacher1 = new Teacher("Maria Ivanovna", "Petrova",
                'F', 35, "Teacher",
                "Russian Literature", 2, FOR_TC_PER_WEEK);

        Parent[] parents = new Parent[]{parent1, parent2};

        ISalary salaryForTeacher1 = teacher1;
        ISalary salaryForTeacher2 = new Teacher("Ivan Petrovich", "Petrov",
                'M', 40, "Teacher", "Maths", 1, FOR_TC_PER_WEEK);

//        parent1.printParent();
//        parent2.printParent();
//        parent3.printParent();
//
//        System.out.println(LINE);
//
//        student1.printParent(parents);
//
//        System.out.println(LINE);
//
//        teacher1.printTeacher();

        aAssert(EXPECTED_BASE_SALARY, teacher1.getBaseSalary());
        aAssert(EXPECTED_PAY_CHECK, teacher1.getSalary());

        System.out.println(teacher1.getTaxes());
        System.out.println(salaryForTeacher1.getTaxes());
        System.out.println(teacher1.getSalaryPerMonth());
        System.out.println(salaryForTeacher2.getTaxes());
        System.out.println(salaryForTeacher2.getSalaryPerMonth());

    }
}
