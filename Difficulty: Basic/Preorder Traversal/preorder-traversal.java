/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public void preorder(Node root,ArrayList<Integer> res){
        if(root==null) return;
        res.add(root.data);
        preorder(root.left,res);
        preorder(root.right,res);
    }
    public ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> res=new ArrayList<>();
        preorder(root,res);
        return res;
    }
}