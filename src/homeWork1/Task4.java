package homeWork1;

public class Task4 {
    /*
     *+Задано уравнение вида q + w = e, q, w, e >= 0.
     * Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
     * Требуется восстановить выражение до верного равенства.
     * Предложить хотя бы одно решение или сообщить, что его нет.
     */
    public static void main(String[] args) {
        String[] input = {"2?", "+", "?5", "=", "69"};
        String firstNumStr = input[0];
        String secondNumStr = input[2];
        String test = "";
        String temp1, temp2;
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                /*
                с помощью replace заменяем одну подстроку на другую
                с помощью String.valueOf преобразовали обьект в строковое представление
                 */
                temp1 = firstNumStr.replace("?", String.valueOf(i));
                temp2 = secondNumStr.replace("?", String.valueOf(j));
                test = temp1 + " " + input[1] + " " + temp2;
                if (Integer.parseInt(temp1) + Integer.parseInt(temp2) == Integer.parseInt(input[4])) {
                    System.out.println(test + " = " + input[4]);
                    counter++;
                }

            }

        }
        if (counter == 0) {
            System.out.println("Решений нет");
        }
    }
}