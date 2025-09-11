/*  A Binary Tree nodea
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Tree {
    public static ArrayList<Integer> list=new ArrayList<>();
    public void preorder(Node root){
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        if(root.left==null) list.add(root.right.data);
        if(root.right==null) list.add(root.left.data);
        preorder(root.left);
        preorder(root.right);
    }
    ArrayList<Integer> noSibling(Node node) {
        list.clear();
        if(node==null){
            list.add(-1);
            return list;
        }
        preorder(node);
        if(list.size()==0) list.add(-1);
        Collections.sort(list);
        return list;
    }
}