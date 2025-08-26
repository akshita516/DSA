/* Question: 1679. Max Number of K-Sum Pairs
You are given an integer array nums and an integer k.
In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
Return the maximum number of operations you can perform on the array.
*/
class Solution {
    public int maxOperations(int[] nums, int k) {
        int n=nums.length, answer=0, left=0, right=n-1;
        Arrays.sort(nums);
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==k){
                left++;
                right--;
                answer++;
            }
            else if(sum<k)
                left++;
            else
                right--;
        }
        return answer;
    }
}
