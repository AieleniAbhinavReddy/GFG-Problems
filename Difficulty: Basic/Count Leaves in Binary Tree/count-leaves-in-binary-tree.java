/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
}*/

class Solution {
    private static int c;
    private static void helper(Node root){
        if(root==null) return;
        if(root.left==null&&root.right==null) c++;
        helper(root.left);
        helper(root.right);
    }
    int countLeaves(Node node) {
        c=0;
        helper(node);
        return c;
    }
}