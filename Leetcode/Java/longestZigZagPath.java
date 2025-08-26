/**
  QUESTION: 1372. Longest ZigZag Path in a Binary Tree
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxLength;
    public int longestZigZag(TreeNode node) {
        maxLength=0;
        helper(node,0,true);
        helper(node,0,false);
        return maxLength;
    }
    private void helper(TreeNode node,int currLength,boolean cameFromLeft){
        if(node==null)
            return;
        maxLength=Math.max(maxLength,currLength);
        if(cameFromLeft){
            helper(node.right,currLength+1,false);
            helper(node.left,1,true);
        }
        else{
            helper(node.left,currLength+1,true);
            helper(node.right,1,false);
        }
    }
}
