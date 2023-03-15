package seminar2;

import java.util.Scanner;

public class Sem2Task1 {
    /*
    сократить строку
    input: "aaaabbbcdd"
    output: a4b3c1d2
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = sc.nextLine();
        char[] temp = str.toCharArray();
        int count = 1;
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length() - 1; i++) {
            if (temp[i] == temp[i + 1]) {
                count++;
            } else {
                String countString = String.valueOf(count);
                newStr.append(temp[i] + countString);
                count = 1;
            }
        }
        newStr.append(temp[temp.length - 1] + String.valueOf(count));
        System.out.println(newStr);


    }
}