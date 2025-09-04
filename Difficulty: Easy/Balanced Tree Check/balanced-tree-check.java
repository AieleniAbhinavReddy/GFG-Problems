/* A binary tree node class
class Node
{
    int data;
    Node left,right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
} */

class Solution {
    public int getHeight(Node root){
        if(root==null) return 0;
        return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }
    public boolean isBalanced(Node root) {
        if(root==null) return true;
        int leftH=getHeight(root.left);
        int rightH=getHeight(root.right);
        return (Math.abs(leftH-rightH)<=1) && isBalanced(root.left) && isBalanced(root.right);
    }
}