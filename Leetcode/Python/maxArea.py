""" Question: 11. Container With Most Water
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
"""
class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxWater=-1
        n=len(height)
        left=0
        right=n-1
        while left<=right:
            if height[left]<height[right]:
                length=height[left]
                left+=1
            else:
                length=height[right]
                right-=1
            width=right-left+1
            area=length*width
            maxWater=max(maxWater,area)
        return maxWater
