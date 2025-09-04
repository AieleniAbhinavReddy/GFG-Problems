/*
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
    void mirror(Node node) {
        if(node==null) return;
        Node temp=node.left;
        node.left=node.right;
        node.right=temp;
        mirror(node.left);
        mirror(node.right);
    }
    boolean isIdentical(Node root1, Node root2) {
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
        return (root1.data == root2.data && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right));
    }
    public boolean isSymmetric(Node root) {
        if(root==null) return true;
        mirror(root.left);
        return isIdentical(root.left,root.right);
    }
}