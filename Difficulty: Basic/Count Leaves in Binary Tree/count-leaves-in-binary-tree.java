/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
}*/

class Solution {
    static int count=0;
    void preorder(Node root){
        if(root==null) return;
        if(root.left==null && root.right==null) count++;
        preorder(root.left);
        preorder(root.right);
    }
    int countLeaves(Node node) {
        count=0;
        preorder(node);
        return count;
    }
}
/*
Approach
preorder algorithm to traverse the entire tree
leaf node = the left child and right child of the node are null
count = to cound the leaf nodes

preorder :
1 -> not leaf
10 -> not leaf
5 -> leaf node -> c=1
39 -> leaf node -> c=2

output is 2


*/