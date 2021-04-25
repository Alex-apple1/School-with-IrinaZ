package PracticeIrinaZ.School;

public final class Student extends BasePerson {

    private final int grade;

    public Student(String firstName, String lastName,
                   char gender, int age, String status, int grade) {
        super(firstName, lastName, gender, age, status);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void printParent(Parent[] parents) {
        for (Parent parent: parents) {
            if (parent.getStudent().equals(this)) {
                System.out.println();
                System.out.println(
                        "Student: " + getFirstName() + " " + getLastName() + " " +
                                getGrade());
                System.out.println("Parent: " + parent.getFirstName() + " " +
                        parent.getLastName() + " phone number: " + parent.getPhoneNumber());

            }
        }
    }

}
