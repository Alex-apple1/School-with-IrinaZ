package PracticeIrinaZ.School;

public class School {
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

        Parent[] parents = new Parent[]{parent1, parent2};

        parent1.printParent();
        parent2.printParent();
        parent3.printParent();

        System.out.println("____________________________________");

        student1.printParent(parents);

    }
}
