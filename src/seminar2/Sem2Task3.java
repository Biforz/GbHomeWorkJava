package seminar2;

import java.io.FileWriter;

public class Sem2Task3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("test\n");
        }
        metod(sb);
    }

    public static void metod(StringBuilder sb) {
        try(FileWriter fw = new FileWriter("src/seminar2/file.txt", false)) {
            fw.write(sb.toString());
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}