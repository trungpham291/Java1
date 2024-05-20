package day9;

import java.util.Scanner;

public class StringHelper {

    public int countVowels(String str) {
//        Hello World Java
//      [H][e][l][l][o][ ][W][o][r][l][d][ ][J][a][v][a]
        char[] chars = str.toCharArray();
//        count
        int count = 0;
        String vowels = "aeiouAEIOU";
//        ueoai
        for (int i = 0; i < chars.length; i++) {
            char currentCharacter = chars[i];
            if (vowels.indexOf(currentCharacter) != -1) {
                count++;
            }
        }
        return count;
    }



    public int checkLenght(String str) {
        return str.length();
    }

    public void showRemoveBankeywords() {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        String[] banKeywords = {"me", "bo", "con"};
        for (int i = 0; i < banKeywords.length; i++) {
            int keywordLenghth = banKeywords[i].length();
            String replaceText = "*";
            switch (keywordLenghth) {
                case 2:
                    replaceText = "**";
                    break;
                case 3:
                    replaceText = "***";
                    break;
            }
            message = message.replace(banKeywords[i], replaceText);
        }
        System.out.println(message);
    }

    public void showValidateExample() {
        Scanner scanner = new Scanner(System.in);
        boolean isValidName = false;
        while (!isValidName) {
            System.out.println("Please enter student name: ");
            String fullName = scanner.nextLine();
//            fullName.isEmpty();
            if (fullName.trim().length() == 0) {
                System.out.println("Invalid name");
            } else {
                isValidName = true;
                System.out.println("Student name is: " + fullName);
            }
        }
    }

    public void showFunctionExample(){
        String fullName = "Dao Hong Luyen Hong Hong Hong";
        boolean equal = fullName.equals("Dao Hong Luyen");
        System.out.println(equal);
        equal = fullName.equalsIgnoreCase("Dao Hong Luyen Hong Hong Hong");
        System.out.println(equal);
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.length());
        System.out.println(fullName.charAt(2));
        String resulf = fullName.replace('a', 'z');
        System.out.println(resulf);
        System.out.println(fullName.replaceAll("Hong", "Xuan"));
        System.out.println(fullName.replaceFirst("Hong", "Xuan"));
        System.out.println(fullName.indexOf("Hong"));
        System.out.println(fullName.indexOf("Nam"));
        System.out.println(fullName.indexOf("Hong", 16));
//        Bat dau tim tu vi tri 16
    }
}
