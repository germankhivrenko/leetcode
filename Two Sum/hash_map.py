class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        index_map = {num: i for i, num in enumerate(nums)}

        for i in range(len(nums)):
            summand = target - nums[i]
            if summand in index_map and i != index_map[summand]:
                return [index_map[summand], i] 
        
