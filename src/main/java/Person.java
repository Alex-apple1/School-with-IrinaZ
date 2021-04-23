public class Person {
    String name;
    int age;
    char sex;

    Car car;

    public Person() {
    }

    public Person(String name, int age, char sex, Car car) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.car = car;
    }

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    String getName() {
        if (sex == 'M') {
            return "Mr. " + name;
        } else return "Mrs. " + name;
    }



//    Boolean isChild() {
//        if (age >= 18) {
//            return false;
//        } else return true;
//    }
}
