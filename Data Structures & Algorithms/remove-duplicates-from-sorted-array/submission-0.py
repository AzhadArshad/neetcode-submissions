class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        k = 1
        for _ in range(len(nums)):
            if k == len(nums):
                break
            if nums[k-1] == nums[k]:
                nums.pop(k)
            else:
                k += 1
        return k
        
        