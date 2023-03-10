package homeWork3;

import java.util.ArrayList;
import java.util.List;

public class HwTask2 {
    /*
    Пусть дан произвольный список целых чисел, удалить из него чётные числа
     */
    public static void main(String[] args) {
        List<Integer> numsList = new ArrayList<>();
        numsList.add(1);
        numsList.add(2);
        numsList.add(3);
        numsList.add(4);
        numsList.add(5);
        numsList.add(6);
        numsList.add(7);
        numsList.add(8);
        numsList.add(9);
        List<Integer> newNumsList = new ArrayList<>();
        for (Integer el : numsList) {
            if (el % 2 != 0) {
                newNumsList.add(el);
            }
        }
        System.out.println("Первоначальный список: " + numsList+"\n" +
                "Список без четных чисел: " + newNumsList);
    }
}
