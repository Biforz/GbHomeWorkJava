package seminar6;

import java.util.*;

public class Sem6Task0 {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        hashSet.add(9);
        Collections.addAll(hashSet, 1,4,5,6,7,8,4,3,2,45,6,4,3,2,4);
        Collections.addAll(linkedHashSet, 1,5,6,7,8,4,3,2,45,6,4,3,2,4); // помнит порядок заполнения
        Collections.addAll(treeSet, 1,5,6,7,8,4,3,2,45,6,4,3,2,4); // сортирует по возрастанию
        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);

        Set<String> hashSetString = new HashSet<>();
        Set<String> linkedHashSetString = new LinkedHashSet<>();
        Set<String> treeSetString = new TreeSet<>();
        Collections.addAll(hashSetString, "a","s","d","e","a","s","d","e","w","we","p","w","we","p");
        Collections.addAll(linkedHashSetString, "a","s","d","e","a","s","d","e","w","we","p","w","we","p");
        Collections.addAll(treeSetString, "a","s","d","e","a","s","d","e","w","we","p","w","we","p");
        System.out.println(hashSetString);
        System.out.println(linkedHashSetString);
        System.out.println(treeSetString);
    }
}
