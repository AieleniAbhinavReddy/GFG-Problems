class Solution {
    static boolean isPrime(int n) {
        if(n==1) return false;
        for(int i=2;i<n/2;i++) if(n%i==0) return false;
        // int l=2,r=(n/2);
        // while(l<r){
        //     if(n%l==0 || n%r==0) return false;
        //     l++;
        //     r--;
        // }
        return true;
    }
}