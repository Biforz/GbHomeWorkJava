package homeWork2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaTask3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/homeWork2/task3Hw.txt");
        Scanner iScanner = new Scanner(fr);
        //System.out.println(iScanner);
        StringBuilder bild = new StringBuilder();
        String texts;
        texts = iScanner.nextLine();
        String[] newLine = texts.split("}");
        // System.out.println(Arrays.toString(newLine));

        for (String item : newLine) {
            // System.out.println(item);
            String[] nums = item.split("\"");
            if (nums.length > 10) {
                bild.append("Студент ");
                bild.append(nums[3]).append(" ").append("получил").append(" ");
                bild.append(nums[7]).append(" ").append("по предмету").append(" ").append(nums[11]);
                bild.append("\n");
            }
        }
        System.out.println(bild);
        FileWriter fw = new FileWriter("src/homeWork2/newTask3Hw.txt");
        fw.write(bild.toString());
        fr.close();
        fw.close();
    }
}