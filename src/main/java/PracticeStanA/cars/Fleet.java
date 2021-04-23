package PracticeStanA.cars;

public class Fleet {
    public static void main(String[] args) {
        Car camry = new Car("Camry", 2021, 32);
        Car corolla = new Car("Corolla", 2015, 35);
        Car tacoma = new Car("Tacoma", 2016, 20);
        Car prius = new Car("Prius", 2010, 50);

        Car[] fleet = {camry, corolla, tacoma, prius};

        FleetUtils.setPricePerGallon(5.25);

        FleetUtils.printAllData(fleet);


//        double avdAge = FleetUtils.getAverageAge(fleet);
//
//        System.out.println("Average car age: " + avdAge + " year(s)");
//
//        double fuelCost = FleetUtils.getFuelCost(fleet, 20000, 3.75);
//
//        System.out.println("Fuel cost of fleet per year: $" + fuelCost);


    }
}
