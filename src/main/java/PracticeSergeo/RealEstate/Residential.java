package PracticeSergeo.RealEstate;

public class Residential extends RealEstate{
    public Residential(int numberOfStoreys, int roomsOnTheFloor) {
        super(numberOfStoreys, roomsOnTheFloor);
    }

    @Override
    public void buildingType() {
        System.out.println("Residential");
    }

}
