package day9;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {

        StringHelper stringHelper = new StringHelper();
        int vowelCount = stringHelper.countVowels("Hello World Java");
        System.out.println(vowelCount);





//        Scanner scanner = new Scanner(System.in);
//        boolean isValidName =  false;
//        while(!isValidName) {
//            System.out.println("Please enter student name: ");
//            String fullName = scanner.nextLine();
////            fullName.isEmpty();
//            if(fullName.trim().length() == 0) {
//                System.out.println("Invalid name");
//            }else {
//                isValidName = true;
//                System.out.println("Student name is: " + fullName);
//            }
//
//        }


//        String fullName = "Dao Hong Luyen Hong Hong Hong";
//        boolean equal = fullName.equals("Dao Hong Luyen");
//        System.out.println(equal);
//        equal = fullName.equalsIgnoreCase("Dao Hong Luyen Hong Hong Hong");
//        System.out.println(equal);
//        System.out.println(fullName.toUpperCase());
//        System.out.println(fullName.toLowerCase());
//        System.out.println(fullName.length());
//        System.out.println(fullName.charAt(2));
//        String resulf = fullName.replace('a', 'z');
//        System.out.println(resulf);
//        System.out.println(fullName.replaceAll("Hong", "Xuan"));
//        System.out.println(fullName.replaceFirst("Hong", "Xuan"));
//        System.out.println(fullName.indexOf("Hong"));
//        System.out.println(fullName.indexOf("Nam"));
//        System.out.println(fullName.indexOf("Hong", 16));
////        Bat dau tim tu vi tri 16
    }
}
