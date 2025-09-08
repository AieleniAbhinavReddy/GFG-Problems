/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    private static List<Node> list=new ArrayList<>();
    public void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        list.add(root);
        inorder(root.right);
    }
    // returns the inorder successor of the Node x in BST (rooted at 'root')
    public int inorderSuccessor(Node root, Node x) {
        inorder(root);
        for(int i=0;i<list.size();i++){
            if(i==list.size()-1) return -1;
            if(list.get(i)==x) return list.get(i+1).data;
        }
        return -1;
    }
}