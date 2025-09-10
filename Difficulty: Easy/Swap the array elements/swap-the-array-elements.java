class Solution {
    public void swapElements(int[] arr) {
        int i=0;
        while( i+2 <arr.length){
            int temp=arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
            i++;
        }
    }
}