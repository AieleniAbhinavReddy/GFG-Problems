// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        int max=0;
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1) c++;
            }
            max=Math.max(max,c);
            arr[i][0]=c;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i][0]==max) return i; 
        }
        return -1;
    }
}