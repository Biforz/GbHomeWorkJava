package homeWork4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Work1 {
    /*
    Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.
     */
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Collections.addAll(list, 6, 14, 26, 32, 38, -10, 4, 2, 28, 35);
        System.out.println(reversed(list));
    }
    private static List<Integer> reversed(List<Integer> list) {
        Collections.reverse(list);
        return list;

    }
}
