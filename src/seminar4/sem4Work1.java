package seminar4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class sem4Work1 {
    /*
    Реализовать консольное приложение, которое:
    1. Принимает от пользователя строку вида: text~num
    2. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num
    3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет ее из списка
     */
    public static void main(String[] args) {
        String[] inputArr;
        String input = "text~1";
        Scanner sc = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        while (!input.equals("exit")) {
            System.out.print("Введите текст: ");
            input = sc.nextLine();
            inputArr = input.split("~");

            if (!inputArr[0].equals("print")) {
                if (list.size() < Integer.parseInt(inputArr[1])) {
                    for (int i = list.size(); i < Integer.parseInt(inputArr[1]); i++) {
                        list.add (null);
                    }
                }
                list.add(Integer.parseInt(inputArr[1]), inputArr[0]);
                System.out.println(list);
            }
            else {
                    System.out.println(list.get(Integer.parseInt(inputArr[1])));
                    list.remove(Integer.parseInt(inputArr[1]));
            }
        }
    }
}
