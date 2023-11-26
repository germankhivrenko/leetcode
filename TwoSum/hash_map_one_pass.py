class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        index_map = {}

        for i in range(len(nums)):
            summand = target - nums[i]
            if summand in index_map:
                return [index_map[summand], i]
            index_map[nums[i]] = i
        
