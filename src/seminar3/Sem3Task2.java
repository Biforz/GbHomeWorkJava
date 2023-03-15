package seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Sem3Task2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Юпитер");
        list.add("Венера");
        list.add("Плутон");
        list.add("Юпитер");
        list.add("Земля");
        list.add("Марс");
        list.add("Венера");
        list.add("Меркурий");
        list.add("Юпитер");
        System.out.println(list);

        Set<String> set = new HashSet<>(list);

        for (String item : set) {
            System.out.println((item + Collections.frequency(list, item)));
        }
    }
}