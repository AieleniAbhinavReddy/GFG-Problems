class Solution {
    public static void inorder(Node root,Set<Integer> set){
        if(root==null) return;
        inorder(root.left,set);
        set.add(root.data);
        inorder(root.right,set);
    }
    public static ArrayList<Integer> findCommon(Node r1, Node r2) {
        Set<Integer> set1=new LinkedHashSet();
        Set<Integer> set2=new LinkedHashSet();
        inorder(r1,set1);
        inorder(r2,set2);
        set1.retainAll(set2);
        ArrayList<Integer> list=new ArrayList<>();
        for(int n:set1){
            list.add(n);
        }
        Collections.sort(list);
        return list;
    }
}