class Tree {
    private static List<Integer> list=new ArrayList<>();
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        list.add(root.data);
        inorder(root.right);
    }
    public static float findMedian(Node root) {
        list.clear();
        inorder(root);
        int size=list.size();
        int mid=size/2;
        if(size%2==0){
            int sum=list.get(mid)+list.get(mid-1);
            return (float)(sum)/2;
        }
        return list.get(mid);
    }
}