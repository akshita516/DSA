/*
QUESTION: 283. Move Zeros
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int count=0, n=nums.length;
        for(int i=0;i<n;i++)
            if(nums[i]!=0)
                nums[count++]=nums[i];
        while(count<n)
            nums[count++]=0;
    }
}
