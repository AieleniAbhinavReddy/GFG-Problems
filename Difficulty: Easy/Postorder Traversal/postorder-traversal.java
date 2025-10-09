/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    private void get(Node root,ArrayList<Integer> list){
        if(root==null) return;
        get(root.left,list);
        get(root.right,list);
        list.add(root.data);
    }
    public ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> list=new ArrayList<>();
        get(root,list);
        return list;
    }
}