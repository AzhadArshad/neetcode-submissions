class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        arr = []
        for n in nums:
            if n in arr:
                continue
            else:
                arr.append(n)
        if len(arr)==len(nums):
            return False
        else:
            return True
         