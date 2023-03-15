package seminar4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class addTimeStartEnd {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        long startTimeArray = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(5);
        }
        long endTimeArray = System.nanoTime();
        List<Integer> linkedList = new LinkedList<>();
        long startTimeLinked = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            linkedList.add(5);
        }
        long endTimeLinked = System.nanoTime();
        System.out.println("Время заполнения ArrayList = " + (endTimeArray - startTimeArray));
        System.out.println("Время заполнения LinkedList = " + (endTimeLinked - startTimeLinked));
        System.out.println("Разница между ArrayList и LinkedList = " + ((endTimeArray - startTimeArray) - (endTimeLinked - startTimeLinked)));
    }
}
