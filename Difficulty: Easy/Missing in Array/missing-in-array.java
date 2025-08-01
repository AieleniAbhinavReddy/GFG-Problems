class Solution {
    int missingNum(int arr[]) {
        if(arr.length==1){
            if(arr[0]==1) return arr[0]+1;
            if(arr[0]!=1) return arr[0]-1;
        }
        Arrays.sort(arr);
        if(arr[0]!=1) return arr[0]-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]!=1) return arr[i]-1;
        }
        return arr[arr.length-1]+1;
    }
}