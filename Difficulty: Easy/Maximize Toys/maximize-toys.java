// User function Template for Java

class Solution {
    static int toyCount(int N, int K, int arr[]) {
        int res=0;
        Arrays.sort(arr);
        int i=0;
        while(K>0 && i<N){
            if(arr[i]>K) break;
            if(arr[i]<=K){
                res++;
                K-=arr[i];
            }
            i++;
        }
        return res;
    }
}