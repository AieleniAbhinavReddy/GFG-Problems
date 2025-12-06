// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        Collections.sort(arr);
        int msf=Integer.MAX_VALUE;
        for(int i=0;i<arr.size();i++){
            int j=m+i-1;
            if(j<=arr.size()-1){
                int d=arr.get(j)-arr.get(i);
                msf=Math.min(msf,d);
            }
        }
        return msf;
    }
}