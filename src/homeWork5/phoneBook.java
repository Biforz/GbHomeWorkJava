package homeWork5;

import java.io.IOException;
import java.util.*;

public class phoneBook {
    /*
    Реализуйте структуру телефонной книги с помощью HashMap,
    учитывая, что 1 человек может иметь несколько телефонов.
     */
    public static void main(String[] args) throws IOException {
        menuPhoneBook();
    }
    public static void menuPhoneBook() throws IOException {
        Map<String, List<String>> listMap = new HashMap<>();
        List<String> newList = new ArrayList<>();
        listMap.put("Дима", Collections.singletonList("89082684848"));
        listMap.put("Маша", Collections.singletonList("84359875454"));
        listMap.put("Саша", Collections.singletonList("+7329323444"));
        listMap.put("Костя", Collections.singletonList("+7342342344"));
        Scanner sc = new Scanner(System.in);
        System.out.print("Перед вами часть меню телефонного справочника\n" +
                "1. Добавить новый контакт\n" +
                "2. Выход\n" +
                "Выберите действие и введите соответствующее число: ");
        String number = sc.nextLine();
        switch (number) {
            case "1":
                System.out.print("Введите имя: ");
                String name = sc.nextLine();
                System.out.print("Введите номер телефона (можно ввести несколько номеров, через пробел): ");
                String numberPhone = sc.nextLine();
                if (listMap.containsKey(name)) {
                    newList.addAll(listMap.get(name));
                    newList.add(numberPhone);
                    listMap.put(name, newList);
                }
                else {
                    newList.add(numberPhone);
                    listMap.put(name, newList);
                }
                System.out.println(listMap);
                break;
            case "2":
                System.out.println("Успешного Вам дня и отличного настроения!!!");
                break;
            default:
                System.out.println("Введена неверная команда");
                break;


        }
        sc.close();
    }
}
