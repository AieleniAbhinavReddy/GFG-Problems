// User function Template for Java

/*
class Node {
    int data;
    Node left, right;
    Node(int key){
        this.data = key;
        this.left = this.right = null;
    }
}
*/

class Tree {
    private static ArrayList<Integer> list=new ArrayList<>();
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        list.add(root.data);
        inorder(root.right);
    }
    int sum(Node root, int k) {
        list.clear();
        inorder(root);
        int sum=0;
        for(int i=0;i<k;i++) sum+=list.get(i);
        return sum;
    }
}