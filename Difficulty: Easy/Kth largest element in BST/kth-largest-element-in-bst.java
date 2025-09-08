/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    private static List<Integer> list=new ArrayList<>();
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        list.add(root.data);
        inorder(root.right);
    }
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root, int k) {
        inorder(root);
        return list.get(list.size()-k);
    }
}