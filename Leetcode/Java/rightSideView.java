/**
  QUESTION: 199. Binary Tree Right Side View
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> answer=new ArrayList<>();
        if(root==null)
            return answer;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int rightmost=0;
            int length=queue.size();
            for(int i=0;i<length;i++){
                TreeNode curr=queue.poll();
                rightmost=curr.val;
                if(curr.left!=null)
                    queue.add(curr.left);
                if(curr.right!=null)
                    queue.add(curr.right);
            }
            answer.add(rightmost);
        }
        return answer;
    }
}
