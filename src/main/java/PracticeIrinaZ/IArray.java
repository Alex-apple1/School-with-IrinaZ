package PracticeIrinaZ;

public class IArray {
    public static void main(String[] args) {

//        String[] catsNames = new String[];

        String[] catsNames = new String[8];

        catsNames [0] = "Мурзик";
        catsNames [1] = "Черныш";
        catsNames [2] = "Мурка";
        catsNames [3] = "Барсик";
        catsNames [4] = "Рыжик";
        catsNames [5] = "Эшли";
        catsNames [6] = "Джина";
        catsNames [7] = "Машка";

        for (int i = 0; i < catsNames.length; i++) {
            System.out.println(catsNames[i]);
        }

//        for (int boxNumber = 0; boxNumber <= catsNames.length - 1; boxNumber++) {
//            System.out.println(boxNumber);
//        }

    }
}
