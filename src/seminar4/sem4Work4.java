package seminar4;


import java.util.Arrays;

public class sem4Work4 {
    /*
    Реализовать стэк с помощью массива.
    Нужно реализовать методы: size(), empty(), push(), peel(), pop()
     */
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Размер массива: " + size(array));
        System.out.println("Массив пуст: " + empty(array));
        System.out.println("Добавить в массив элемент \"10\": " + Arrays.toString(push(array, 10)));
        System.out.println(peek(array));
        System.out.println(Arrays.toString(pop(array)));


    }
    public static boolean empty(Integer[] array) {
        if (array.length < 1) {
            return true;
        }
        else {
            return false;
        }
    }
    public static int size(Integer[] array) {
        return array.length;
    }
    public static Integer[] push(Integer[] array, Integer newElement) {
        Integer[] newArray = new Integer[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = newElement;
        return newArray;
    }
    public static int peek(Integer[] array) {
        return array[array.length - 1];
    }
    public static Integer[] pop(Integer[] array) {
        Integer[] newArray = new Integer[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, array.length - 1);
        return newArray;
    }
}
