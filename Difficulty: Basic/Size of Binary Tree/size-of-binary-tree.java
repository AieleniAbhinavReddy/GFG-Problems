/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    private static int size=0;
    private static void helper(Node root){
        if(root==null) return;
        size++;
        helper(root.left);
        helper(root.right);
    }
    public static int getSize(Node node) {
        size=0;
        helper(node);
        return size;
    }
}