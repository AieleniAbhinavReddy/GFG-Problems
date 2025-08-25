/*
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/

class Solution {
    private static ArrayList<Integer> preord1,preord2;
    public Solution(){
        preord1=new ArrayList<>();
        preord2=new ArrayList<>();
    }
    public static void preorder(Node root,boolean flag){
        if(root==null){
            return;
        }
        if(flag){
            preorder(root.left,flag);
            preorder(root.right,flag);
            preord1.add(root.data);
        }else{
            preorder(root.left,flag);
            preorder(root.right,flag);
            preord2.add(root.data);
        }
    }
    boolean isIdentical(Node root1, Node root2) {
        preorder(root1,true);
        preorder(root2,false);
        return preord1.equals(preord2);
    }
}