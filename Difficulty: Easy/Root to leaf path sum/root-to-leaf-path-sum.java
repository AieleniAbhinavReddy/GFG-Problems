/*
// A Binary Tree node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    boolean hasPathSum(Node root, int target) {
        if(root==null) return false;
        target-=root.data;
        if(root.left==null && root.right==null) return target==0;
        return hasPathSum(root.left,target) || hasPathSum(root.right,target);
    }
}