package homeWork5;

import java.io.IOException;
import java.util.*;

public class HwWork1 {
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
        listMap.put("Дима", Collections.singletonList("89082684848, 83845623949"));
        listMap.put("Маша", Collections.singletonList("84359875454"));
        listMap.put("Саша", Collections.singletonList("+7329323444"));
        listMap.put("Костя", Collections.singletonList("+7342342344"));
        Scanner sc = new Scanner(System.in);
        System.out.print("Перед вами часть меню телефонного справочника\n" +
                "1. Добавить новый контакт\n" +
                "2. Показать все контакты\n" +
                "3. Выход\n" +
                "Выберите действие и введите соответствующее число: ");
        String number = sc.nextLine();
        switch (number) {
            case "1":
                System.out.print("Введите имя: ");
                String name = sc.nextLine(); // вводим в терминале имя
                if (listMap.containsKey(name)) { // проверка по ключу на наличие имени в справочнике
                    System.out.print("Данный контакт уже имеет телефон, что будем делать?\n" +
                            "11 - добавить в контакт еще один телефон\n22 - перезаписать текущий телефон на новый" +
                            "\n33 - выход в главное меню" +
                            "\nЛюбая другая клавиша - выход из программы\n" +
                            "Выберите действие: ");
                    int num = sc.nextInt(); // вводим выбранное действие
                    if (num == 11) { // тут мы добавляем в найденный контакт еще один телефон
                        System.out.print("Введите номер телефона: ");
                        String numberPhone = sc.next();
                        newList.addAll(listMap.get(name));
                        newList.add(numberPhone);
                        listMap.put(name, newList);
                        System.out.println("Телефон добавлен к контакту");
                    }
                    else if (num == 22) { // тут перезаписывает телефон контакта
                        System.out.print("Введите номер телефона: ");
                        String numberPhone = sc.next();
                        newList.add(numberPhone);
                        listMap.put(name, newList);
                        System.out.println("Номер телефона изменен");
                    }
                    else if (num == 33) {
                        menuPhoneBook();
                    }
                    else {
                        System.out.println("Вы вышли из программы. для дальнейшей работы требуется перезапуск");
                        break;
                    }
                }
                else {
                    System.out.print("Введите номер телефона: ");
                    String numberPhone = sc.next();

                    newList.add(numberPhone);
                    listMap.put(name, newList);
                    System.out.println("Контакт создан");
                }
                checkPhoneBook(listMap);
                break;
            case "2":
                checkPhoneBook(listMap);
                System.out.print("Желаете продолжить работу?\nY - да;\nN - нет (закрыть программу)" +
                        "\nВыберите действие: ");
                String st = sc.next().toUpperCase();
                if (st.equals("Y")) {
                    menuPhoneBook();
                }
                break;
            case "3":
                System.out.println("Успешного Вам дня и отличного настроения!!!");
                break;
            default:
                System.out.println("Введена неверная команда");
                break;
        }
        sc.close();
    }
    public static void checkPhoneBook(Map<String, List<String>> listMap) {
        for (String str : listMap.keySet() ) {
            System.out.println(str + " " + listMap.get(str));
        }
    }
}