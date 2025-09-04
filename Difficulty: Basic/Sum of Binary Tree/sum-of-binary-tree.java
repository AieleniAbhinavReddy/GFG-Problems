/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    // Function to return sum of all nodes of a binary tree
    static int sumBT(Node root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return root.data;
        return sumBT(root.left)+sumBT(root.right)+root.data;
    }
}