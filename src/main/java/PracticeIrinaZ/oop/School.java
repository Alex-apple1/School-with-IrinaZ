package PracticeIrinaZ.oop;

public class School {
    public static void main(String[] args) {

        Teacher teacher = new Teacher(false, "Ivan Petrovich",
                "Ivanov", 55, "Math");
        Student student = new Student(true, "Masha",
                "Semenova", 10, 5);
        teacher.printCard();
        student.printCard();



//        Teacher teacher3 = new Teacher("Ivan Petrovich",
//                "Ivanov", 64, true, "Math");
//
//        Student student1 = new Student("Masha",
//                "Semenova", 10, true, 5);
////        teacher3.printCard(teacher3.getFirstName(),
////                teacher3.getLastName(),
////                teacher3.getAge(),
////                teacher3.getIsTeacher(),
////                teacher3.getSubject());
//        student1.printCard(student1.getFirstName(),
//                student1.getLastName(),
//                student1.getAge(),
//                student1.isStudent(),
//                student1.getGrade());

    }
}
