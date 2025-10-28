/*node class of the binary ssearch tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}*/
class Solution {
    public static int sum=0;
    public static void helper(Node root){
        if(root==null) return;
        if(root.left==null && root.right==null) sum+=root.data;
        helper(root.left);
        helper(root.right);
    }
    public static int sumOfLeafNodes(Node root) {
        sum=0;
        helper(root);
        return sum;
    }
}