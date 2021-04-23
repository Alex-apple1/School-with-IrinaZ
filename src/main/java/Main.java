public class Main {
    public static void main(String[] args) {
        Car h = new Car ("Honda");

        Person a = new Person("Alex", 40, 'M', h);

        Person b = new Person("Anna", 30, 'F', h);

        System.out.println(a.car.name);
        System.out.println(b.getName());

    }
}
