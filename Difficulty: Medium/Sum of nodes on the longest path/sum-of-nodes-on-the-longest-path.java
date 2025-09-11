/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
} */
class Solution {
    public int sumOfLongRootToLeafPath(Node root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return root.data;
        int leftLen=getLen(root.left);
        int rightLen=getLen(root.right);
        if(leftLen>rightLen){
            return root.data+sumOfLongRootToLeafPath(root.left);
        }else if(rightLen>leftLen){
            return root.data+sumOfLongRootToLeafPath(root.right);
        }else{
            return root.data+Math.max(sumOfLongRootToLeafPath(root.left),sumOfLongRootToLeafPath(root.right));
        }
    }
    public int getLen(Node root){
        if(root==null) return 0;
        return 1+Math.max(getLen(root.left),getLen(root.right));
    }
}