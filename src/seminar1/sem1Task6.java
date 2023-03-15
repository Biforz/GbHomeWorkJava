package seminar1;

import java.util.Scanner;

public class sem1Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число, которое хотите возвести в степень: ");
        double n = sc.nextDouble();
        System.out.print("Введите степень возведения: ");
        double m = sc.nextDouble();
        sc.close();
        System.out.println(Math.pow(n, m));
    }
}