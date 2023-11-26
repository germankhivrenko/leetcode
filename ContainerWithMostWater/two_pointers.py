class Solution:
    def maxArea(self, height: List[int]) -> int:
        l = 0
        r = len(height) - 1
        most = (r - l) * min([height[l], height[r]])

        while l < r:
            curr = (r - l) * min([height[l], height[r]]) 
            most = max(most, curr)

            if height[l] > height[r]:
                r -= 1
            else:
                l += 1
        
        return most
        
