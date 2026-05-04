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
    public TreeNode invertTree(TreeNode root) {
        Deque<TreeNode> node = new ArrayDeque<>();
        if(root != null){
            node.add(root);
        }
        while(!node.isEmpty()){
            TreeNode cur = node.peek();
            TreeNode temp = cur.left;
            cur.left=cur.right;
            cur.right=temp;
            System.out.println(node.peek().val);
            if(cur.left != null){
                node.add(cur.left);
            }
            if(cur.right != null){
                node.add(cur.right);
            }
            node.remove();
        }
        return root;
        
    }
}
