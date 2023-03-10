package homeWork2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class JavaTask2 {
    /*
    Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
     */
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(JavaTask2.class.getName());

        FileHandler fh = new FileHandler("src/homeWork2/logTask2Hw.txt", true);
        logger.addHandler(fh); // запись логов в текстовый документ
        logger.setUseParentHandlers(false); // с помощью этой команды убрал вывод логов в терминале
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat); // форматирование записей в журнале

        logger.info("Старт сортировки");
        int[] mass = {21, 19, 32, 4, 55, 51, 100, 27};
        boolean sorted = false;
        int temp;


        while (sorted != true) {
            sorted = true;
            logger.info("Условие цикла while выполнено, продолжаем сортировку");
            logger.info("Присвоили значению boolean = true");
            logger.info("Запускаем цикл для прохождения по всей длинне массива и проверки условия");
            for (int i = 0; i < mass.length - 1; i++) {
                if (mass[i] > mass[i + 1]) {
                    logger.info("Найден не отсортированный элемент, сортируем его");
                    temp = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = temp;
                    sorted = false;
                    logger.info("Присвоили значение boolean = false");
                }
            }
        }
        System.out.println(Arrays.toString(mass));
        logger.info("Сортировка завершена и выведена в консоль");
    }
}
