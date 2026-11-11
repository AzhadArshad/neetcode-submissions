class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        arr = [n for n in nums if n != val]
        nums[:] = arr[:]
        return len(nums)