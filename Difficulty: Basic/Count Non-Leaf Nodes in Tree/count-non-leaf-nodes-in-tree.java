/*class Node
{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/

// function should return the count of total number of non leaf nodes in the tree.
class Solution {
    private static int c=0;
    private static void helper(Node root){
        if(root==null) return;
        if(root.left!=null || root.right!=null) c++;
        helper(root.left);
        helper(root.right);
    }
    int countNonLeafNodes(Node root) {
        c=0;
        helper(root);
        return c;
    }
}