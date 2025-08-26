/**
  QUESTION: 1161. Maximum Level Sum of a Binary Tree
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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int maxLevel=1, maxSum=Integer.MIN_VALUE, currLevel=0;
        while(!queue.isEmpty()){
            currLevel++;
            int currSum=0;
            int length=queue.size();
            for(int i=0;i<length;i++){
                TreeNode curr=queue.poll();
                currSum+=curr.val;
                if(curr.left!=null)
                    queue.add(curr.left);
                if(curr.right!=null)
                    queue.add(curr.right);
            }
            if(currSum>maxSum){
                maxSum=currSum;
                maxLevel=currLevel;
            }
        }
        return maxLevel;
    }
}
