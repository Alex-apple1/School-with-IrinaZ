package PracticeIrinaZ;

public class QAndAByIrinaZ {
    public static void main(String[] args) {
        int[] catsAges = {2, 3, 4, 1, 5, 6, 9, 10};
//
//        String[] catNames = new String[8];
//        catNames[0] = "Murzic";
//        catNames[1] = "Черныш";
//        catNames[2] = "Мурка";
//        catNames[3] = "Барсик";
//        catNames[4] = "Рыжик";
//        catNames[5] = "Эшли";
//        catNames[6] = "Джина";
//        catNames[7] = "Машка";
//
//
//        String[] catColors = new String[8];
//        catColors[0] = "Grey";
//        catColors[1] = "Black";
//        catColors[2] = "Grey";
//        catColors[3] = "Brown";
//        catColors[4] = "Red";
//        catColors[5] = "Grey";
//        catColors[6] = "Red";
//        catColors[7] = "Grey";
//
////            int min = 1000;
////
////            for (int i = 0; i < catsAges.length; i++) {
////                if (catsAges[i] < min) {
////                    min = catsAges[i];
////                }
////            }
////        System.out.println(min);
//
        String[] catAgesString = new String[8];
        for (int i = 0; i < catsAges.length; i++) {
            catAgesString[i] = String.valueOf(catsAges[i]);
//            System.out.println(catAgesString[i]);
        }
//
//        String[][] cats = new String[3][8];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 8; j++) {
//                if (i == 0) {
//                    cats[i][j] = catNames[j];
//                } else if (i == 1) {
//                    cats[i][j] = catAgesString[j];
//                } else
//                    cats[i][j] = catColors[j];
//
////                System.out.println(cats[i][j]);
//            }
//        }
//            for (int j = 0; j < 8; j++) {
//                for (int i = 0; i < 3; i++) {
////                    System.out.println();
//                    System.out.println(cats[i][j]);
////                    System.out.println();
//                }
//                System.out.println("_________________________________");
//            }
//        System.out.println(cats[0][4] + ", "
//                + cats[1][4] + ", " + cats[2][4]);

//            String numberString = "1";
//        int number = 1;
//            int numberInt = Integer.parseInt(numberString);
//        System.out.println(numberInt);
//        if (number == numberInt) {
//            System.out.println("True");
//        } else System.out.println("False");
//
//        String numberStringNew = String.valueOf(number);
//        System.out.println(numberStringNew);
//        if (numberString.equals(numberStringNew)) {
//            System.out.println("True");
//        } else System.out.println("False");
        int[] catAgesInt = new int[8];
        for (int i = 0; i < catAgesString.length; i++) {
            catAgesInt[i] = Integer.parseInt(catAgesString[i]);
            System.out.println(catAgesInt[i]);
        }
    }
}
