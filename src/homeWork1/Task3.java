package homeWork1;

import java.util.Scanner;

public class Task3 {
    /*
    Реализовать простой калькулятор
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNumber = sc.nextInt();
        System.out.print("Введите второе число: ");
        int secondNumber = sc.nextInt();
        System.out.print("Введите действие (+,-,*,/): ");
        String func = sc.next();
        sc.close();


        switch (func) {
            case "+":
                System.out.println(getSum(firstNumber, secondNumber));
                break;
            case "-":
                System.out.println(getMinus(firstNumber, secondNumber));
                break;
            case "*":
                System.out.println(getMath(firstNumber, secondNumber));
                break;
            case "/":
                if (secondNumber != 0) {
                    System.out.println(getDel(firstNumber, secondNumber));
                } else {
                    System.out.println("На ноль делить нельзя!!!");
                }
            default:
                break;
        }
    }
    public static int getSum(int a, int b) {
        return a + b;
    }
    public static int getMinus(int a, int b) {
        return a - b;
    }
    public static int getMath(int a, int b) {
        return a * b;
    }
    public static int getDel(int a, int b) {
        return a / b;
    }
}
