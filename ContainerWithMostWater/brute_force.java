public class Solution {
    public int maxArea(int[] height) {
        int most = Integer.MIN_VALUE;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int curr = (j - i) * Math.min(height[i], height[j]);
                most = Math.max(most, curr);
            }
        }
        return most;
    }
}
