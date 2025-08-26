/* Question: 11. Container With Most Water
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
*/
class Solution {
    public int maxArea(int[] height) {
        int n=height.length, left=0, right=n-1, answer=0;
        while(left<=right){
            int length=0,width=0;
            if(height[left]>height[right]){
                length=height[right];
                right--;
            }
            else{
                length=height[left];
                left++;
            }
            width=right-left+1;
            answer=Math.max(answer,length*width);
        }
        return answer;
    }
}
