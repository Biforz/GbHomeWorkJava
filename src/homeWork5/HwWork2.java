package homeWork5;

import java.security.Key;
import java.util.*;

public class HwWork2 {
    public static void main(String[] args) {
        Map<String, String> list = new HashMap<>();
        list.put("Иванов", "Иван");
        list.put("Петрова", "Светлана");
        list.put("Белова", "Кристина");
        list.put("Кусина", "Анна");
        list.put("Крутова", "Анна");
        list.put("Юрин", "Иван");
        list.put("Лыков", "Петр");
        list.put("Чернов", "Павел");
        list.put("Чернышев", "Петр");
        list.put("Федорова", "Мария");
        list.put("Светлова", "Марина");
        list.put("Савина", "Мария");
        list.put("Рыкова", "Мария");
        list.put("Лугова", "Марина");
        list.put("Владимирова", "Анна");
        list.put("Мечников", "Иван");
        list.put("Петин", "Петр");
        list.put("Ежов", "Иван");

        Set<String> str = new TreeSet<>(list.values());
        HashMap<String, Integer> newListok = new HashMap<>();

        for (String item : str) {
            newListok.put(item, Collections.frequency(list.values(), item));
//            System.out.println(item + " имя встретилось " + Collections.frequency(list.values(), item) + " раз");
        }
        /*
        Понимаю что дальше не самое рациональное так как будет занимать лишнюю память.
        Не было проблем вывести сам список, отсортированный по за алфавиту.
        А вот с числовыми значениями пришлось придумывать костыли, не совсем эффективные
         */
        List<Integer> sortedNumber = new ArrayList<>(newListok.values());
        sortedNumber = sortedNumber.stream().sorted().toList();
        HashMap<String, Integer> resultList = new LinkedHashMap<>();
        for (int i = sortedNumber.size() - 1; i >= 0; i --) {
            for (Map.Entry<String, Integer> item : newListok.entrySet()) {
                if (sortedNumber.get(i) == item.getValue()) {
                    resultList.put(item.getKey(), item.getValue());
                }
            }
        }
        System.out.println("Отсортированный список с количеством повторений в порядке убывания:\n" + resultList);
    }
}