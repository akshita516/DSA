/* Question: 1493. Longest Subarray of 1's After Deleting One Element */
class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length, left=0, right=0, answer=0, zeros=0;
        while(right<n){
            if(nums[right]==0)
                zeros++;
            while(zeros>1){
                if(nums[left]==0)
                    zeros--;
                left++;
            }
            answer=Math.max(answer,right-left);
            right++;
        }
        return answer;
    }
}
