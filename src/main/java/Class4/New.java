package Class4;

public class New {
    public static void main(String[] args) {
        Kitty small = new Kitty();
        small.name = "Bob";
//        small.callMammy = "tfygghg";
        small.getCallMammy();

        System.out.println(small.name);
        System.out.println(small.callMammy);
        System.out.println(small.getCallMammy());

        Kitty kitty1 = new Kitty();
        kitty1.name = "Sam";
        System.out.println(kitty1.name);

        Dog dog = new Dog();
//        dog.name = "fffh";
        System.out.println(dog.name);
        dog.voice();

    }
}
