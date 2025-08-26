'''
  Question: 724. Find Pivot Index
'''
class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        n=len(nums)
        for i in range(n):
            leftSum=sum(nums[:i])
            rightSum=sum(nums[i+1:])
            if leftSum==rightSum:
                return i
        return -1
