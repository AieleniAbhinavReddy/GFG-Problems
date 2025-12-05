// User function Template for Java

class Solution {
    void segregate0and1(int[] arr) {
        int c=0;
        
        for(int n:arr){
            if(n==1) c++;
        }
        int zc=arr.length-c;
        for(int i=0;i<arr.length;i++){
            if(zc!=0){
                arr[i]=0;
                zc--;
            }
            else arr[i]=1;
        }
    }
}
