//import java.util.*;

public class rotateArray189 {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] temp = new int[n];
        
        // Fill the temp array with the rotated elements
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }
        
        // Copy the rotated elements from temp back to nums
        System.arraycopy(temp, 0, nums, 0, n);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7}; // Expected result: [5, 6, 7, 1, 2, 3, 4]
        int k = 3;
        
        rotate(nums, k);
        
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

