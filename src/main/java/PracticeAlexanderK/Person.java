package PracticeAlexanderK;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private int age;
    private boolean hasHair;
    private String gender;

    public static final String planetOfOrigin = "Earth";
    private static int population = 0;

    public Person(String firstName, String lastName, String gender) {
//        this.firstName = firstName;
        setFirstName(firstName);
//        this.lastName = lastName;
        setLastName(lastName);
//        this.gender = gender;
        setGender(gender);
    }

    @Override
    public String toString() {
        return "Alloha{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", birthMonth=" + birthMonth +
                ", birthDay=" + birthDay +
                ", age=" + age +
                ", hasHair=" + hasHair +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Person(String firstName, String lastName, String gender, int birthYear, int birthMonth, int birthDay) {
        population += 1;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
    }

    public static int getPopulation() {
        return population;
    }

    public int getAge() {
        return 2021 - birthYear;
    }

    public Person() {
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        String result = "";

        if (!(gender.equalsIgnoreCase("male")
                || gender.equalsIgnoreCase("female"))) {
                return firstName;
        }

        if (gender.equalsIgnoreCase("male")) {
            result = "Mr. " + firstName;
        } else result = "Mrs. " + firstName;
        return result;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasHair() {
        return hasHair;
    }

    public void setHasHair(boolean hasHair) {
        this.hasHair = hasHair;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
