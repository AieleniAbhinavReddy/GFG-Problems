/*
class Node {
    int data;
    Node left, right;

    Node() {
        this.data = 0;
        this.left = this.right = null;
    }

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}
*/
class Solution {
    private static ArrayList<Integer> list=new ArrayList<>();
    public void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        list.add(root.data);
        inorder(root.right);
    }
    Node bToDLL(Node root) {
        if(root==null) return root;
        list.clear();
        inorder(root);
        Node head=new Node(list.get(0));
        Node curr=head;
        for(int i=1;i<list.size();i++){
            Node newNode=new Node(list.get(i));
            if(i==list.size()-1){
                newNode.left=curr;
            }
            curr.right=newNode;
            newNode.left=curr;
            curr=newNode;
        }
        return head;
    }
}