package practice;

public class StringSergeyName {
    public static void main(String[] args) {
        String str = "Sergey";
//        String str2 = "Alex";

//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 'e') {
//                System.out.println(i);
//            }
//        }
        String str3 = str.replace("e", "ee")
                .replace("g", "j")
                .replace("S", "A");
        System.out.println(str3);
    }
}
