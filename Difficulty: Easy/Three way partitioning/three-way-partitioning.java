class Solution {
    // Function to partition the array around the range such
    // that array is divided into three parts.
    public void threeWayPartition(int arr[], int a, int b) {
        int[] temp=new int[arr.length];
        int t=0;
        for(int n:arr){
            if(n<a) temp[t++]=n;
        }
        for(int n:arr){
            if(n>=a && n<=b) temp[t++]=n;
        }
        for(int n:arr){
            if(n>b) temp[t++]=n;
        }
        for(int i=0;i<temp.length;i++){
            arr[i]=temp[i];
        }
    }
}