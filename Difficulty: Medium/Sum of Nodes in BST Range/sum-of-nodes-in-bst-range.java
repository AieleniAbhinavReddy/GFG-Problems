/*
class Node {
    int data;
    Node left, right;
    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    private int sum=0;
    private void preorder(Node root,int l,int r){
        if(root==null) return ;
        if(l<=root.data && root.data<=r) sum+=root.data;
        preorder(root.left,l,r);
        preorder(root.right,l,r);
    }
    public int nodeSum(Node root, int l, int r) {
        sum=0;
        preorder(root,l,r);
        return sum;
    }
}
