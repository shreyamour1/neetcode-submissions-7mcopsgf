/**
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
    public List<List<Integer>> levelOrder(TreeNode root) {
     
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null){
            return ans;
        }
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> temp= new ArrayList<>();
            while(size>0){
            TreeNode m = q.poll();
            temp.add(m.val);
            if(m.left!=null){
               q.add(m.left);
            }
            if(m.right!=null){
               q.add(m.right);
            }
            size--;
            }
            ans.add(temp);
        }
        return ans;
        
    }
}
