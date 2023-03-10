package homeWork1;

import java.util.Scanner;

public class Task1 {
    /*
    Вычислить [n-ое треугольного число](сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число, до которого будем считать: ");
        int number = sc.nextInt();
        int sum = 0;
        int math = 1;
        for (int i = 1; i <= number; i++) {
            sum += i;
            math *= i;
        }
        System.out.println("Треугольное число: " + sum);
        System.out.printf("Результат произведения от 1 до %d: %d\n", number, math);
    }
}
