package seminar5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sem5Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 слова через пробел: ");
        String[] list = sc.nextLine().split(" ");
        System.out.println(isIzomorf(list));
    }
    public static boolean isIzomorf(String[] arr) {
        if (arr[0].length() != arr[1].length()) { // еслт длинна первого слова не равна длинне второго слова
            return false;
        }
        Map<Character, Character> word = new HashMap<>();
        char mKey;
        char mVal;
        for (int i = 0; i < arr[0].length(); i++) {
            mKey = arr[0].charAt(i); // возвращаем указанные символы из строки
            mVal = arr[1].charAt(i);
            if (word.containsKey(mKey)) {
                if (word.get(mKey) != mVal) {
                    return false;
                }
            }
            word.put(mKey, mVal);
        }
        Map<Character, Character> wordRevers = new HashMap<>();
        for (int i = 0; i < arr[0].length(); i++) {
            mKey = arr[1].charAt(i);
            mVal = arr[0].charAt(i);
            if (wordRevers.containsKey(mKey)) {
                if (wordRevers.get(mKey) != mVal) {
                    return false;
                }
            }
            wordRevers.put(mKey, mVal);
        }
        return true;
    }
}
