package seminar6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Sem6Task1 {
    /*
    1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
    2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных
    значений в данном массиве и верните его в виде числа с плавающей запятой.
    Для вычисления процента используйте формулу:
    процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
     */
    public static void main(String[] args) {
        int[] array = getRandom();
        System.out.println(Arrays.toString(array));
        System.out.println(getQWE(array));
    }
    public static int[] getRandom() {
        int[] array = new int[1000]; // создал массив
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 24); // заполнил массив рандомными числами
        }
        return array;
    }
    public static double getQWE(int[] array) {
        Set<Integer> set = new HashSet<>(); // создал сет
        for (int item : array) {
            set.add(item); // заполнил сет уникальными числами
        }
        return (double) (set.size() * 100) / array.length; // вернул готовый результат
    }
}
