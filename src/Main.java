import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        №1
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Введите число строк:");
        int countString = Integer.parseInt(scanner.nextLine());
        String veryShortString = null;
        String veryLongString = null;
        for (int i = 0; i < countString; i++) {
            System.out.println("Введите строку номер " + (i + 1));
            String currentString = scanner.nextLine();
            if (veryShortString == null || currentString.length() < veryShortString.length()) {
                veryShortString = currentString;
            }if (veryShortString == null || currentString.length() > veryShortString.length()) {
                veryLongString = currentString;
            }
        }
        System.out.println("Самая короткая строка = " + veryShortString);
        System.out.println("Ее длина равна " + veryShortString.length());
        System.out.println("Самая длинная строка = " + veryLongString);
        System.out.println("Ее длина равна " + veryLongString.length());*/
//        №2
        /*String[] strings = new String[3];
        System.out.println("Введите 3 строки: ");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        for (int i = strings.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (strings[j].length() > strings[j + 1].length()) {
                    String tmp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = tmp;
                }
            }
        }
        System.out.println("По возрастанию длины: ");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }*/
//        №3
        /*String[] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            System.out.println("Введите строку №" + (i + 1));
            str[i] = scanner.nextLine();
        }
        float average = 0f;
        for (String item : str) {
            average += (float) item.length();
        }
        average /= str.length;
        System.out.println("Средняя длина строки = (" + average + ")");
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() < average) {
                System.out.println("Строка меньшая чем средняя по длинне: ");
                System.out.println("'" + str[i] + "'" + " ee длина = " + str[i].length());
            }
        }*/
//        №4
        /*String[] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            System.out.println("Введите строку №" + (i + 1));
            str[i] = scanner.nextLine();
        }
        String goal = str[0]; // искомое слово
        System.out.println("Массив: ");
        for (int i=0;i<str.length;i++){
            System.out.print(str[i]+", "); // выводим очередной элемент
            if (diffWords(str[i])<diffWords(goal)) {
                goal = str[i]; // новый мин.эл
            }
        }
        System.out.println("");
        System.out.println("Искомое слово: "+goal+", число разных символов: "+diffWords(goal));*/

//        №5
        /*System.out.println("Введите строку: ");
        String word = scanner.nextLine();
        String[] splittedWord = word.split("");
        for (String character : splittedWord) {
            System.out.print(character.repeat(2));
        }*/
//        №*
        /*System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        String[] splittedWord = str.split(" ");
        for (String character : splittedWord) {
            System.out.println('\"' + character + '\"' + '\t' + "Проверка на полиндром: " + '\"' + isPalindrome(character) + '\"');
        */}
//        №4
    /*private static int diffWords(String st){
        StringBuffer u = new StringBuffer();
        String c;
        for (int i=0;i<st.length();i++) {
            c = String.valueOf(st.charAt(i));
            if (u.indexOf(c)==-1)
                u.append(c);
        }
        return u.length();
    }*/
    }
//        №*
    /*public static Boolean isPalindrome(String s) {
        return s.equals((new StringBuilder(s)).reverse().toString());
    }
}*/
