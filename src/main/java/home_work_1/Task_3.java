package home_work_1;

import java.util.Arrays;
import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        int val = 3;
        int[] nums = new int[100];
        Random rnd = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rnd.nextInt(0, 6);
        }

        System.out.println(Arrays.toString(nums));

        int right_index = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (i <= right_index) {
                if (nums[i] == val && nums[right_index] != val) {
                    nums[i] = nums[right_index];
                    nums[right_index] = val;
                }
                if (nums[right_index] == val) {
                    right_index--;
                    i--;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
