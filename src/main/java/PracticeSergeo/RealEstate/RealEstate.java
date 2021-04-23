package PracticeSergeo.RealEstate;

public class RealEstate {
    int numberOfStoreys;
    int roomsOnTheFloor;

    public RealEstate(int numberOfStoreys, int roomsOnTheFloor) {
        this.numberOfStoreys = numberOfStoreys;
        this.roomsOnTheFloor = roomsOnTheFloor;
    }

    public int getNumberOfStoreys() {
        return numberOfStoreys;
    }

    public void setNumberOfStoreys(int numberOfStoreys) {
        this.numberOfStoreys = numberOfStoreys;
    }

    public int getRoomsOnTheFloor() {
        return roomsOnTheFloor;
    }

    public void setRoomsOnTheFloor(int roomsOnTheFloor) {
        this.roomsOnTheFloor = roomsOnTheFloor;
    }

    public void buildingType() {
        System.out.println("Real Estate");
    }
}
