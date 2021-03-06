package PracticeIrinaZ.oop;

import static PracticeIrinaZ.oop.Utils.printLine;

public class Teacher extends Person {

    private String subject;

    public Teacher(boolean isStudent, String firstName,
            String lastName, int age, String subject) {
        super(isStudent, firstName, lastName, age);
        this.setSubject(subject);
    }

    public void setSubject(String subject) {
        if (getPerson().equals("Teacher")) {
            this.subject = subject;
        } else {
            this.subject = null;
        }
    }

    @Override
    public void printCard() {
        super.printCard();
        System.out.println(subject);
        printLine();
    }
//
//    public void printTeacherCard() {
//        printCard();
//        System.out.println(subject);
//        printLine();
//    }

//    Teacher(boolean isTeacher) {
//        this.isTeacher = true;
//    }
//
//    Teacher(String firstName,
//            String lastName,
//            int age,
//            boolean isTeacher,
//            String subject) {
//        this.setFirstName(firstName);
//        this.setLastName(lastName);
//        this.setAge(age);
//        this.setIsTeacher(isTeacher);
//        this.setSubject(subject);
//    }
//
//    Teacher(String firstName, String lastName, int age) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//    }
//
//    public void setFirstName(String firstName) {
//        if (firstName != "") {
//            this.firstName = firstName;
//        } else {
//            System.out.println("Not valid first name");
//        }
//    }
//
//    public void setLastName(String lastName) {
//        if (lastName != "") {
//            this.lastName = lastName;
//        } else {
//            System.out.println("Not valid last name");
//        }
//    }
//
//    public void setAge(int age) {
//        if (age >= 21 && age < 65) {
//            this.age = age;
//        } else {
//            System.out.println("Not eligible age");
//            this.age = 0;
//        }
//    }
//
//    public void setIsTeacher(boolean isTeacher) {
//        if (age == 0) {
//            this.isTeacher = false;
//        } else {
//            this.isTeacher = isTeacher;
//        }
//    }
//
//    public void setSubject(String subject) {
//        if (isTeacher == false) {
//            this.subject = null;
//        } else {
//            this.subject = subject;
//        }
//    }
//
//    public void printCard(String firstName,
//                          String lastName,
//                          int age,
//                          boolean isTeacher,
//                          String subject) {
//        System.out.println("______________________________");
//        if (isTeacher) {
//            System.out.println("Teacher");
//        }
//        System.out.println("First name: " + firstName);
//        System.out.println("Last name: " + lastName);
//        System.out.println("Age: " + age);
//        System.out.println("Subject: " + subject);
//        System.out.println("______________________________");
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getSubject() {
//        return subject;
//    }
//
//    public boolean getIsTeacher() {
//        return isTeacher;
//    }


}
