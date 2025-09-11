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
    // public static boolean find(Node root,int target){
    //     if(root==null) return false;
    //     if(root.data==target) return true;
    //     return (find(root.left,target) || find(root.right,target));
    // }
    // public static void inorder(Node r1,Node r2,ArrayList<Integer> list){
    //     if(r1==null) return;
    //     inorder(r1.left,r2,list);
    //     if(find(r2,r1.data)) list.add(r1.data);
    //     inorder(r1.right,r2,list);
    // }
    // public static ArrayList<Integer> findCommon(Node r1,Node r2){
    //     ArrayList<Integer> list=new ArrayList<>();
    //     inorder(r1,r2,list);
    //     return list;
    // }
}