package homeWork3;

import java.util.ArrayList;
import java.util.List;

public class HwTask3 {
    /*
    Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(89);
        list.add(99);
        list.add(44);
        list.add(33);
        list.add(22);
        list.add(54);
        list.add(27);
        list.add(5);
        int max = list.get(0);
        int min = max;
        int sum = 0;
        int count = 0;
        for (Integer el : list) {
            sum += el;
            count ++;
            if (el > max) {
                max = el;
            } else if (el < min) {
                min = el;
            }
        }
        System.out.println("Максимальное: " + max);
        System.out.println("Минимальное: " + min);
        System.out.println("Сумма всех элементов списка " + sum);
        System.out.println("Количество элементов в списке: " + count);
        System.out.println("Среднее арифметическое: " + (double) sum / count);
    }
}
