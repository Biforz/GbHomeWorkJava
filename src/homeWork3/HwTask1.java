package homeWork3;

import java.util.Arrays;

public class HwTask1 {
    /*
    Реализовать алгоритм сортировки слиянием
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 7, 5, 9, 2, 1, 8, 4, 3};
        System.out.println(Arrays.toString(mergeSoft(array)));
    }

    public static int[] mergeSoft(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] right = Arrays.copyOfRange(arr, left.length, arr.length);
        return merge(mergeSoft(left), mergeSoft(right));

    }

    public static int[] merge(int[] left, int[] right) {
        int resIn = 0, leftIn = 0, rightIn = 0;
        int[] result = new int[left.length + right.length];

        while (leftIn < left.length && rightIn < right.length) {
            if (left[leftIn] < right[rightIn]) {
                result[resIn++] = left[leftIn++];
            } else {
                result[resIn++] = right[rightIn++];
            }
        }
        while (resIn < result.length) {
            if (leftIn != left.length) {
                result[resIn++] = left[leftIn++];
            } else {
                result[resIn++] = right[rightIn++];
            }
        }
        return result;
    }


}
