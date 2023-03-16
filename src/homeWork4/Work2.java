package homeWork4;

import java.util.Collections;
import java.util.LinkedList;

public class Work2 {
    /*
    Реализуйте очередь с помощью LinkedList со следующими методами:
    • enqueue() — помещает элемент в конец очереди,
    • dequeue() — возвращает первый элемент из очереди и удаляет его,
    • first() — возвращает первый элемент из очереди, не удаляя.
     */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Collections.addAll(list, 1,2,3,4,5,6,7,8,9);
        System.out.println("Задан список: " + list);
        enqueue(list, 10);
        System.out.println("Добавили в конец списка новое число, пусть это будет десять: " + list);
        System.out.println("Вернул первый элемент из списка: " + dequeue(list));
        System.out.println("Проверил удаление первого элемента из списка: " + list);
        System.out.println("Вернул первый элемент из списка без удаления: " + first(list));
        System.out.println("Проверил список: " + list);
    }
    public static void enqueue(LinkedList<Integer> list, Integer item) { // добавление в конец очереди
        list.add(item);
    }
    public static Integer dequeue(LinkedList<Integer> list) {
        Integer temp = list.getFirst(); // возвращаем первый элемент и помещаем его в temp
        list.removeFirst(); // удаляем элемент из начала списка
        return temp;
    }
    public static Integer first(LinkedList<Integer> list) {
//        Integer temp = list.getFirst();
        return list.getFirst(); //
    }
}
