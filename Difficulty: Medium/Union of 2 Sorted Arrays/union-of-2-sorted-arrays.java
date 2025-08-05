class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        HashSet<Integer> set=new LinkedHashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int n:a) set.add(n);
        for(int n:b) set.add(n);
        for(int n:set) list.add(n);
        Collections.sort(list);
        return list;
    }
}
