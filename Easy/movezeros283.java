import java.util.Arrays;

class MoveZeros283 {
    public void moveZeroes(int[] nums) {
        int i = 0; // Pointer for the position of the next non-zero element
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                // Swap elements nums[j] and nums[i]
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++; // Move the pointer for the next non-zero element
            }
        }
    }

    public static void main(String[] args) {
        MoveZeros283 sol = new MoveZeros283();
        int[] nums = {0, 1, 0, 3, 12};
        sol.moveZeroes(nums);
        System.out.println(Arrays.toString(nums)); // Print the array after moving zeroes
    }
}