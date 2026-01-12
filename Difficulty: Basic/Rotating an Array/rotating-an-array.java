// User function Template for Java

class Solution {
    static void reverse(int arr[],int s, int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    void leftRotate(int arr[], int d) {
        int n=arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
}
/*
Approach
reverse array logic
left rotate
reverse(0,d-1)
reverse(d,n-1)
reverse(0,n-1)

reverse -> temp logic is used
*/