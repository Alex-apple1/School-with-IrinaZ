package PracticeIrinaZ.oop;

import static PracticeIrinaZ.oop.Utils.printLine;

public class Person {

    private String person;
    private String firstName;
    private String lastName;
    private int age;

    public Person(boolean isStudent, String firstName,
           String lastName, int age) {
        this.setPerson(isStudent);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);

    }

    public void setPerson(boolean isStudent) {
        if (isStudent) {
            this.person = "Student";
        } else {
            this.person = "Teacher";
        }
    }

    public void setFirstName(String firstName) {
        if (firstName != "") {
            this.firstName = firstName;
        } else {
            System.out.println("Not valid First Name");
        }
    }

    public void setLastName(String lastName) {
        if (firstName != "") {
            this.lastName = lastName;
        } else {
            System.out.println("Not valid Last Name");
        }
    }

    public void setAge(int age) {
        if (person.equals("Student")) {
            if (5 <= age && age < 18) {
                this.age = age;
            } else {
                System.out.println("Not valid age");
                this.age = 0;
            }
        } else if (person.equals("Teacher")) {
            if (18 <= age && age < 65) {
                this.age = age;
            } else {
                System.out.println("Not valid age");
                this.age = 0;
            }
        } else {
            System.out.println("!!! Can`t recognize a Person");
            this.age = 0;
            this.person = null;
        }
    }

    public String getPerson() {
        return person;
    }

    public void printCard() {
        printLine();
        if (person.equals("Student")) {
            System.out.println("Student");
            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);
            System.out.println("Age: " + age);
        } else if (person.equals("Teacher")) {
            System.out.println("Teacher");
            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);
            System.out.println("Age: " + age);
        }
    }
}
