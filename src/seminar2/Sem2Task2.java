package seminar2;

import java.util.Scanner;

public class Sem2Task2 {
    /*
    напишите метод, который принимает на вход строку (String) и определяет
    является ли строка палиндроном (возвращает boolean значение)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String newString = sc.nextLine();
        System.out.println(check(newString));
    }
    public static boolean check(String newString) {
        char[] temp = newString.replace(" ", "").toLowerCase().toCharArray();
        for (int i = 0; i < newString.length() / 2; i++) {
            if (temp[i] != temp[newString.length() - i - 1]) {
                return false;
            }
        }
        return true;
    }

}