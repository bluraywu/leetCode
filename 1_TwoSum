import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> occurent = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (occurent.containsKey(diff))
                return new int[]{occurent.get(diff), i};
            occurent.put(nums[i], i);
        }
        return new int[0];
    }
}