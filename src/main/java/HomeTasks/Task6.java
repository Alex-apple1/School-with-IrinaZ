package HomeTasks;

import java.util.Arrays;
import java.util.Locale;

public class Task6 {
    public static void main(String[] args) {
//        String s = "Перестановочный алгоритм быстрого действия";
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == 'о') {
//                System.out.println("о");
//            }
//        }

//        String s = "Перевыборы выбранного президента";
//        int sum = 0;
//        for (int i = 0; i < s.length(); i++) {
//                    if (s.charAt(i) == 'е') {
//                        sum += 1;
//                    }
//                }
//        System.out.println(sum);

//        String s = "Посмотрите как Рите нравится ритм";
//        String lowCase = s.toLowerCase(Locale.ROOT);
//        String[] arr = lowCase.split("");
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            if (i == 'р') {
//                String rit = arr[i];
//                System.out.println(rit);
//
//            }
//        }


//        String s = "Посмотрите как Рите нравится ритм";
//        String lowCase = s.toLowerCase(Locale.ROOT);
//        for (int i = 0; i < lowCase.length(); i++) {
//            if (lowCase.charAt(i) == 'р' && lowCase.charAt(i+1) == 'и') {
//                System.out.println(i);
//            }
//        }

//

//        String s = "Посмотрите как Рите нравится ритм";
//
//        String str = s.toLowerCase(Locale.ROOT);
//        String substr = "рит";
//
//        int index = str.indexOf(substr);
//        while (index != -1) {
//            System.out.println(index);
//            index = str.indexOf(substr, index + 1);
//        }

//        необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
        String[][] array = {{"Привет", "всем", "кто"},
                            {"изучает", "язык", "программирования"},
                            {"java"}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
//                if (array[i][j].indexOf('е') == -1) {
//                    System.out.println(array[i][j]);
//                }

                if (!array[i][j].contains("е")) {
                    System.out.println(array[i][j]);
                }
            }

//                boolean noE = true;
//                for (int k = 0; k < array[i][j].length(); k++) {
//                    if (array[i][j].charAt(k) == 'е') {
//                        noE = false;
//                }
//            }
//                if (noE) {
//                    System.out.println(array[i][j]);
//                }
//            }

        }

    }
}
