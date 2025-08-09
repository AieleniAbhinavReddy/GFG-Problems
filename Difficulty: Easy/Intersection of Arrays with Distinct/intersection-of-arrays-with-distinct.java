class Solution {
    public static int intersectSize(int a[], int b[]) {
        int c=0;
        HashSet<Integer> set=new HashSet<>();
        for(int n:a) set.add(n);
        for(int n:b) if(set.contains(n)) c++;
        return c;
    }
}