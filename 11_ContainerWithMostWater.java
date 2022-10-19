import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int largestArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int length = right - left;
            if (minHeight * length > largestArea) {
                largestArea = minHeight * length;
            }
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return largestArea;
    }
}