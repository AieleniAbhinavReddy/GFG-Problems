class Solution {
    public int search(int arr[], int x) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}

/*
steps 
a loop
a condition

1 -> 1=x -> nothing ->0
2 -> 2=x -> nothing -> 1
3 -> 3=x -> return 2 -> 2
....

return -1

*/
