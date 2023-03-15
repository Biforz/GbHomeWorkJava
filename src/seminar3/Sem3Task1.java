package seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Sem3Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add(new Random().nextInt(0, 10));
        }
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);
        //System.out.println(nums.stream().sorted().toList());

    }
}