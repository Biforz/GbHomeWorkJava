package seminar4;

import java.util.LinkedList;
import java.util.Scanner;

public class sem4Work2 {
    /*
    Реализовать консольное приложение, которое:
    Принимает от пользователя и “запоминает” строки.
    Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
    Если введено revert, удаляет предыдущую введенную строку из памяти.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        String action = "";
        while (!action.equals("print")) {
            action = sc.nextLine();
            if (action.equals("print")) {
                String temp;
                temp = list.getFirst();
                list.set(0, list.getLast());
                list.set(list.size() - 1, temp);
                System.out.println(list);

            }
            else if (list.size() > 0 && action.equals("revert")) {
                list.remove(list.size() - 1);
                System.out.println(list);
            } else if (action.equals("quit")) {
                System.out.println(list);
                System.exit(0);
            }
            else {
                list.add(action);
            }
        }
        System.out.println(list);
    }
}
