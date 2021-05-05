package PracticeIrinaZ.interfaces.School;

public final class Principal extends BaseAdministrator {

    public Principal(String firstName, String lastName, char gender,
                     int age, String status, double salary) {
        super(firstName, lastName, gender, age, status, salary);
    }

    @Override
    public double getSalary() {
        return 0;
    }

    @Override
    public double getTaxes() {
        return 0;
    }
}
