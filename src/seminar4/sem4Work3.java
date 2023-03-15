package seminar4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class sem4Work3 {
    /*
    1. Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка
    2. написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди
     */
    public static void main(String[] args) {
         int[] array = new int[]{1,45,7,1,5,46,78};
        System.out.println(getStack(array));
        System.out.println(getStack(array).getClass());
        System.out.println(getQueue(array));
        System.out.println(getQueue(array).getClass());
    }
    public static Stack<Integer> getStack(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int item : array) {
            stack.add(item);
        }
        return stack;
    }
    public static Queue<Integer> getQueue(int[] array) {
        Queue<Integer> queue = new LinkedList<>();
        for (int item : array) {
            queue.add(item);
        }
        return queue;
    }
}
