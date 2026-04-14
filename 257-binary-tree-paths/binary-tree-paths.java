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
    public List<String> binaryTreePaths(TreeNode root) {
       List<String> list=new ArrayList<>();
       String path="";
       helper(root,path,list);
       return list; 
    }
    void helper(TreeNode node,String path,List<String> list){
        if(node==null){
            return;
        }
        path+=node.val;
        if(node.right==null && node.left==null){
            list.add(path);
            return;
        }
        path+="->";
        helper(node.left,path,list);
        helper(node.right,path,list);
    }
}