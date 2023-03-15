package seminar3;

import java.util.ArrayList;
import java.util.List;

public class Sem3Task3 {
    public static void main(String[] args) {
        List<String> nums = new ArrayList<>();
        nums.add("1");
        nums.add("g");
        nums.add("5");
        nums.add("t");
        nums.add("2");
        List<String> newList = new ArrayList<>(); // создали новую коллекцию
        for (String el : nums) {
            try {
                Integer.parseInt(el); // если значение парсится, то ничего не делаем
            } catch (Exception e) {
                newList.add(el); // если значение не распарсилось, то добавляем его в новую коллекцию
            }
        }
        System.out.println(newList); // выводим новую коллекцию
    }
}