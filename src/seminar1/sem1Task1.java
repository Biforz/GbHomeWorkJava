package seminar1;

import java.time.LocalDateTime;

public class sem1Task1 {
    public static void main(String[] args) {
        LocalDateTime nowDate = LocalDateTime.now();
        System.out.println(nowDate); // выводит дату и время
        System.out.println(LocalDateTime.now().getDayOfYear()); // выводит текущий день. без переменной
    }
}