import java.util.*;

class Intersection350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Create a map to count the frequency of each element in nums1
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums1) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        // Create a list to store the intersection of nums1 and nums2
        List<Integer> intersection = new ArrayList<>();
        for (int num : nums2) {
            // Check if the current num exists in the map and has a positive count
            if (counts.containsKey(num) && counts.get(num) > 0) {
                intersection.add(num);
                // Decrease the count of the element in the map
                counts.put(num, counts.get(num) - 1);
            }
        }

        // Convert the list of intersection results to an array
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = solution.intersect(nums1, nums2);
        System.out.println("Intersection: " + Arrays.toString(result));
        
        // You can add more test cases here
    }
}

