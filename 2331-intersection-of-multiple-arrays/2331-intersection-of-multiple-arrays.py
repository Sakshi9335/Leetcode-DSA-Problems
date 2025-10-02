class Solution:
    def intersection(self, nums: List[List[int]]) -> List[int]:
        result = set(nums[0])

        
        for n in nums[1:]:
            result &= set(n)

        
        return sorted(result)

        