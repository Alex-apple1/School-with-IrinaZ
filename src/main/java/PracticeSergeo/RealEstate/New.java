package PracticeSergeo.RealEstate;

public class New {
    public static void main(String[] args) {
        Owner owner = new Owner("Alex");
        Residential residential = new Residential(25, 15);

        Commercial commercial = new Commercial(100, 32);

        System.out.println(owner.ownerName);
        residential.buildingType();
        System.out.println(residential.numberOfStoreys);
        System.out.println(residential.roomsOnTheFloor);

        commercial.buildingType();
        System.out.println(commercial.numberOfStoreys);
        System.out.println(commercial.roomsOnTheFloor);

        System.out.println("_____________________");

        Owner owner2 = new Owner("Val");
        Residential residential2 = new Residential(25, 15);

        Commercial commercial2 = new Commercial(100, 32);

        System.out.println(owner2.ownerName);
        residential.buildingType();
        System.out.println(residential2.numberOfStoreys);
        System.out.println(residential2.roomsOnTheFloor);

        commercial.buildingType();
        System.out.println(commercial2.numberOfStoreys);
        System.out.println(commercial2.roomsOnTheFloor);

        System.out.println("_____________________");

    }
}
