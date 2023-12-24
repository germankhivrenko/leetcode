class Solution:
    def maxArea(self, height: List[int]) -> int:
        most = float('-inf')
        for i in range(len(height)):
            for j in range(i + 1, len(height)):
                curr = (j - i) * min([height[i], height[j]])
                most = max(most, curr)
        return most
