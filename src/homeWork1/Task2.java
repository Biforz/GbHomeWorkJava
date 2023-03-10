package homeWork1;

public class Task2 {
    /*
    Вывести все простые числа от 1 до 1000
     */
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            if (simble(i)) {
                System.out.print(i + ", ");
            }
        }
    }
    public static boolean simble(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}