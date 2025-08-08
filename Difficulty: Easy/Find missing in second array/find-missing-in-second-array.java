// User function Template for Java

class Solution {
    int binarySearch(int[] arr,int t){
        int l=0,r=arr.length-1;
        while(l<=r){
            int m=(l+r)/2;
            if(arr[m]==t) return t;
            if(arr[m]>t) r=m-1;
            if(arr[m]<t) l=m+1;
        }
        return -1;
    }
    ArrayList<Integer> findMissing(int[] a, int[] b) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(b);
        for(int n:a){
            int i=binarySearch(b,n);
            if(i==-1) list.add(n);
        }
        return list;
    }
}
