package homeWork2;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class JavaTask4 {
    /*
    Задача 4*. К калькулятору из предыдущего дз добавить логирование.
     */
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(JavaTask4.class.getName());

        /*
        В строке ниже: при отсутствии файла создаст новый и будет в него записывать логи.
        Если файл такой уже есть, то он будет дописывать в него новые логи, без удаления старых
        т.е. не будет перезаписывать файл целиком
         */
        FileHandler fh = new FileHandler("src/homeWork2/logTask4Hw2.txt", true);

        logger.setUseParentHandlers(false); // с помощью этой команды убрал вывод логов в терминале
        logger.addHandler(fh); // таким образом записываю все созданные логи в файл

        SimpleFormatter sFormat = new SimpleFormatter(); // форматирование журнала сообщений
        fh.setFormatter(sFormat);

        logger.info("Запуск калькулятора");

        Scanner sc = new Scanner(System.in);
        logger.info("Запрос пользователю ввести первое число");
        System.out.print("Введите первое число: ");
        int firstNumber = sc.nextInt();
        logger.info("Считали введенное пользователем первое число");
        logger.info("Запрос пользователю ввести арифметическое действие");
        System.out.print("Введите действие (+,-,*,/): ");
        String func = sc.next();
        logger.info("Считали введенное пользователем арифметическое действие");
        logger.info("Запрос пользователю ввести второе число");
        System.out.print("Введите второе число: ");
        int secondNumber = sc.nextInt();
        logger.info("Считали введенное пользователем второе число");

        sc.close();
        logger.info("Закрыли сканнер");

        switch (func) {
            case "+":
                System.out.println("Результат сложения: " + getSum(firstNumber, secondNumber));
                logger.info("Пользователь получил результат сложения");
                break;
            case "-":
                System.out.println("Результат вычетания: " + getMinus(firstNumber, secondNumber));
                logger.info("Пользователь получил результат вычетания");
                break;
            case "*":
                System.out.println("Результат произведения: " + getMath(firstNumber, secondNumber));
                logger.info("Пользователь получил результат умножения");
                break;
            case "/":
                if (secondNumber != 0) {
                    System.out.println("Результат деления: " + getDel(firstNumber, secondNumber));
                    logger.info("Пользователь получил результат деления");
                } else {
                    System.out.println("На ноль делить нельзя!!!");
                    logger.log(Level.WARNING, "Ошибка при делении на 0");
                }
                break;
            default:
                logger.log(Level.WARNING, "Пользователь неверно ввел арифметическое действие");
                System.out.println("Вы не правильно ввели арифметическое действие");
                break;
        }
    }

    public static int getSum(int a, int b) { return a + b; }
    public static int getMinus(int a, int b) {
        return a - b;
    }
    public static int getMath(int a, int b) {
        return a * b;
    }
    public static double getDel(int a, int b) {
        return (double) a / b;
    }
}
