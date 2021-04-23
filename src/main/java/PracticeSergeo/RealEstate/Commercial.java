package PracticeSergeo.RealEstate;

public class Commercial extends RealEstate {
    public Commercial(int numberOfStoreys, int roomsOnTheFloor) {
        super(numberOfStoreys, roomsOnTheFloor);
    }

    @Override
    public void buildingType() {
        System.out.println("Commercial");
    }
}
