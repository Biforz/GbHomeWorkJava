package seminar5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sem5Task3 {
    public static void main(String[] args) {
        Map<Character, Integer> mp = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L',50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);

        String inputStr = "XIV";
        char ch;
        int sum = 0;

        for (int i = 0; i < inputStr.length(); i++) { // пробегаемся по длинне значения
            ch = inputStr.charAt(i); // так как даны ключи, берем эти ключи
            list.add(mp.get(ch)); // записываем значения ключей в лист
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) < list.get(i + 1)) {
                sum -= list.get(i);
            }
            else {
                sum += list.get(i);
            }
        }
        sum += list.get(list.size() - 1);
        System.out.println(sum);
    }
}
