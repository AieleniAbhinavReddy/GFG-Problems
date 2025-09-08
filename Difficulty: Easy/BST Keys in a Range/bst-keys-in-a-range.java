class Solution {
    private static ArrayList<Integer> list=new ArrayList<>();
    public static void traverse(Node root,int l,int r){
        if(root==null) return;
        traverse(root.left,l,r);
        if(root.data>=l && root.data<=r) list.add(root.data);
        traverse(root.right,l,r);
    }
    // Function to return a list of BST elements in a given range.
    public static ArrayList<Integer> printNearNodes(Node root, int low, int high) {
        list.clear(); 
        traverse(root,low,high);
        return list;
    }
}