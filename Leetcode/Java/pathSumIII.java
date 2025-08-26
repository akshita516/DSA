/**
 QUESTION: 1372 Longest zigzag path in a binary tree; 
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
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long,Integer> map=new HashMap<>();
        map.put(0L,1);
        return pathSumHelper(root,targetSum,0L,map);
    }
    private int pathSumHelper(TreeNode node,int targetSum,long currSum,HashMap<Long,Integer> map){
        if(node==null)
            return 0;
        int currPath=0;
        long newSum=currSum+node.val;
        if(newSum==targetSum || map.containsKey(newSum-targetSum))
            currPath+=map.getOrDefault(newSum-targetSum,0);
        map.put(newSum,map.getOrDefault(newSum,0)+1);
        currPath+=pathSumHelper(node.left,targetSum,newSum,map);
        currPath+=pathSumHelper(node.right,targetSum,newSum,map);
        map.put(newSum,map.get(newSum)-1);
        if(map.get(newSum)==0)
            map.remove(newSum);
        return currPath;
    }
}
