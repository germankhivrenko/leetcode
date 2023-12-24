public class Solution {
    public int maxArea(int[] height) {
        var l = 0;
        var r = height.length - 1;
        var most = (r - l) * Math.min(height[l], height[r]);

        while (l < r) {
            var curr = (r - l) * Math.min(height[l], height[r]);
            most = Math.max(most, curr);
            if (height[l] > height[r]) {
                r--;
            } else {
                l++;
            }
        }

        return most;
    }
}
