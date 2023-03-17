package seminar5;

import java.util.HashMap;
import java.util.Map;

public class Sem5Task0 {
    public static void main(String[] args) {
        Map<Integer, String> people = new HashMap<>();
        people.put(1234, "Иванов");
        people.put(12334, "Петров");
        people.put(12344, "Сидоров");
        people.put(12354, "Козлов");
        people.put(122234, "Иванов");
        people.put(12314, "Бунов");
        people.put(123114, "Иванов");
        people.put(1234678, "Иванов");
        if (people.containsValue("Иванов")) {
            for (Integer number : people.keySet()) {
                if (people.get(number).equals("Иванов")) {
                    System.out.println(people.get(number) + " номер паспорта " + number);
                }
            }
        }
        else {
            System.out.println("Нет сотрудников с такой фамилией");
        }
    }
}
