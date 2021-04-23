package Class4;

public class Cat extends Animal {
    String name;
    String color;
    String catBreed;

    public Cat(String name, String catBreed) {
        this.name = name;
        this.catBreed = catBreed;
    }

    public Cat() {

    }

    @Override
    public void voice() {
        System.out.println("Myaaaaaaaaaaau");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
