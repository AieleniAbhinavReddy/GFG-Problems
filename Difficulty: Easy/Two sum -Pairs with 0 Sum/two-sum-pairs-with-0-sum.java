// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        Set<Integer> seen=new HashSet<>();
        Set<ArrayList<Integer>> set=new HashSet<>();
        for(int n:arr){
            int req=-n;
            if(seen.contains(req)){
                int a=Math.min(n,req);
                int b=Math.max(n,req);
                set.add(new ArrayList<>(List.of(a,b)));
            }
            seen.add(n);
        }
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(ArrayList<Integer> l:set) list.add(l);
        Collections.sort(list,Comparator.comparing((ArrayList<Integer> l)->l.get(0)).thenComparing(l->l.get(1)));
        return list;
    }
}
