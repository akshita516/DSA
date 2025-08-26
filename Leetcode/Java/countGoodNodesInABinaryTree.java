/**
 QUESTION 1448: Count good nodes in a binary tree;
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
    int count;
    public int goodNodes(TreeNode root) {
        count=0;
        int maxPathValue=root.val;
        goodNodesHelper(root,maxPathValue);
        return count;
    }
    private void goodNodesHelper(TreeNode node,int maxPathValue){
        if(node==null)
            return;
        if(node.val>=maxPathValue){
            count++;
            maxPathValue=node.val;
        }
        goodNodesHelper(node.left,maxPathValue);
        goodNodesHelper(node.right,maxPathValue);
    }
}
