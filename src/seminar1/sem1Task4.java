package seminar1;

import java.util.Arrays;

public class sem1Task4 {
    public static void main(String[] args) {
        int temp = 2;
        int[] array = new int[]{3,2,2,3};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] == temp) {
                    int buff = array[j];
                    array[j] = array[i];
                    array[i] = buff;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}