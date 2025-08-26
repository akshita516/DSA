/* Question : 1004. Max Consecutive Ones III */ 
class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0, right=0, n=nums.length, answer=0, flips=0;
        while(right<n){
            while(right<n && (nums[right]==1 || flips<k)){
                if(nums[right]==0)
                    flips++;
                right++;
            }
            answer=Math.max(answer,right-left);
            while(left<right && nums[left]==1)
                left++;
            left++;
            right++;
        }
        return answer;
    }
}
