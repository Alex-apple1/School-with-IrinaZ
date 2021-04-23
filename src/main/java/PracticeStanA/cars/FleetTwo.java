package PracticeStanA.cars;

public class FleetTwo {
    public static void main(String[] args) {
        Car ford = new Car("Ford F350", 2020, 9);
        Car ram = new Car("Ram 3500", 2020, 8, "White");

        System.out.println(ford.getColor());
        System.out.println(ram.getColor());

        ram.setColor("grey");

        System.out.println("__________________");
        System.out.println(ford.getColor());
        System.out.println(ram.getColor());


        Car[] fleet = {ford, ram};

        System.out.println(ram.getColor());

        ram.setColor("Green");

        System.out.println(ram.getColor());

        FleetUtils.printAllData(fleet);

//        FleetUtils.printFleetData(fleet);
//        double avdAge = FleetUtils.getAverageAge(fleet);
//
//        System.out.println("Average car age: " + avdAge + " year(s)");
//
//        double fuelCost = FleetUtils.getFuelCost(fleet, 20000, 3.75);
//
//        System.out.println("Fuel cost of fleet per year: $" + fuelCost);

    }
}
