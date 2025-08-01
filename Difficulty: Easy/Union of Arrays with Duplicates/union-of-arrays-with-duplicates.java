class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        ArrayList<Integer> res=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int n:a) set.add(n);
        for(int n:b) set.add(n);
        for(int n:set) res.add(n);
        return res;
    }
}