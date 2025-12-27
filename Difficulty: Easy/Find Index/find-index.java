// User function Template for Java

class Solution {
    // Function to find starting and end index
    static int[] findIndex(int arr[], int key) {
        int f=-1,l=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                if(f==-1){
                    f=i;
                }
                l=i;
            }
        }
        return new int[]{f,l};
    }
}