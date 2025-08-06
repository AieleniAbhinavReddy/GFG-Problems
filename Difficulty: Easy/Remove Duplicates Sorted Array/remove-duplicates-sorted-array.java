class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new LinkedHashSet<>();
        for(int n:arr) set.add(n);
        for(int n:set) list.add(n);
        return list;
    }
}
