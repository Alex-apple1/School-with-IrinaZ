package PracticeIrinaZ;

import java.util.logging.SocketHandler;

public class  NityNineBotlesSong {
    public static void main(String[] args) {
        for (int beerBottleCount = 99; beerBottleCount >=0; beerBottleCount-- ) {
            String noMoreBottles = "no more bottles of beer";
            String noMore = "No more";
            String bottlesOfBeer = " bottles of beer";
            String goToTheStore = "Go to the store and buy some ";
            String onTheWall = " on the wall";
            String comma = ", ";
            String dot = ". ";

            if (beerBottleCount != 2 && beerBottleCount !=1 && beerBottleCount !=0) {
                //System.out.print(beerBottleCount + " bottles of beer on the wall, ");
                println();
                print(beerBottleCount);
                print(bottlesOfBeer);
                print(onTheWall);
                print(comma);
//                System.out.println(beerBottleCount + " bottles of beer.");
                print(beerBottleCount);
                print(bottlesOfBeer);
                print(dot);
                println();
                printTakeOneDown();
//                System.out.println(beerBottleCount - 1 + " bottles of beer on the wall.");
                print(beerBottleCount - 1);
                print(bottlesOfBeer);
                print(onTheWall);
                print(dot);
                println();
            } else {
                if (beerBottleCount == 2) {
                    //System.out.print(beerBottleCount + " bottles of beer on the wall, ");
                    println();
                    print(beerBottleCount);
                    print(bottlesOfBeer);
                    print(onTheWall);
                    print(comma);
//                System.out.println(beerBottleCount + " bottles of beer.");
                    print(beerBottleCount);
                    print(bottlesOfBeer);
                    print(dot);
                    println();
                    printTakeOneDown();
//                System.out.println(beerBottleCount - 1 + " bottles of beer on the wall.");
                    print(beerBottleCount - 1);
                    print(replaceSLetter(bottlesOfBeer));
                    print(onTheWall);
                    print(dot);
                    println();
                } else if (beerBottleCount == 1) {
                    println();
//                    System.out.print(beerBottleCount + " bottle of beer on the wall, ");
                    print(beerBottleCount);
                    print(replaceSLetter(bottlesOfBeer));
                    print(onTheWall);
                    print(comma);
//                    System.out.println(beerBottleCount + " bottle of beer.");
                    print(beerBottleCount);
                    print(replaceSLetter(bottlesOfBeer));
                    print(comma);
                    println();
                    printTakeOneDown();
//                    System.out.println(" no more bottles of beer on the wall.");
                    print(noMoreBottles);
                    print(onTheWall);
                    print(dot);
                    println();


                } else if (beerBottleCount == 0){
                    beerBottleCount = 99;
                    println();
//                    System.out.println("No more bottles of beer on the wall, " +
//                            "no more bottles of beer.");

                    print(noMore);
                    print(bottlesOfBeer);
                    print(onTheWall);
                    print(comma);
                    print(toLowerCase(noMore));
                    print(bottlesOfBeer);
                    print(dot);
                    println();

//                    System.out.print("Go to the store and buy some more, ");
                    print(goToTheStore);
                    print(getFourLastLetters(noMore));
                    print(comma);
//                    System.out.println(beerBottleCount + " bottles of beer on the wall.");
                    print(beerBottleCount);
                    print(bottlesOfBeer);
                    print(onTheWall);
                    print(dot);
                    println();
                    break;
                }
            }
        }
    }

//    String bottlesOfBeer = " bottles of beer";
//    String onTheWall = " on the wall";
//    String comma = ", ";
//    String dot = ". ";

    private static void printTakeOneDown() {
        System.out.print("Take one down and pass it around, ");
    }
    private static void print(String string) {
        System.out.print(string);
    }
    private static void print(Integer number) {
        System.out.print(number);
    }
    private static void println() {
        System.out.println();
    }
    private static String toLowerCase(String string) {
        String newString = string.toLowerCase();
        return newString;
    }
    private static String replaceSLetter(String string) {
        String newString = string.replace("s", "");
        return newString;
    }
    private static String getFourLastLetters(String string) {
        if (string.length() >= 5) {
            return string.substring(string.length() - 5);
        } return null;
    }
}
