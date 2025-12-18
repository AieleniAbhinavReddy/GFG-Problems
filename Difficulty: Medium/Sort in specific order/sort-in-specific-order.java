class Solution {
    public void sortIt(int[] arr) {
        // code here
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for(int n:arr){
            if(n%2==0) even.add(n);
            else odd.add(n);
        }
        Collections.sort(even);
        Collections.sort(odd,(a,b) -> b.compareTo(a));
        int i=0;
        for(int n:odd) arr[i++]=n;
        for(int n:even) arr[i++]=n;
    }
}
