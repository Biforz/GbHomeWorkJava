package seminar1;

public class sem1Task3 {
    /*
    найти максимальную длинну повторяющихся элементов
     */
    public static void main(String[] args) {
        int[] numb = new int[]{1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1};
        int max = 0;
        int count = 0;
        for (int i = 0; i < numb.length; i++) {
            if (numb[i] == 1) {
                count += 1;
                if (max < count) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println("Длинна повторяющихся элементов массива = " + max);
    }
}