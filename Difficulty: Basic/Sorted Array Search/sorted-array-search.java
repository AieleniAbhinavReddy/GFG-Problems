class Solution {
    static boolean searchInSorted(int arr[], int k) {
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==k){
                return true;
            }else if(arr[mid]<k){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return false;
    }
}

/*
Binary Search : it is divide and conquer appraoch to solve a problem
we keep on divide the problem until we get to a state and then we will use those and conquer them to find the answer

[1, 2, 3, 4, 6] , k = 6

1) we use two variables l=0,r=4

--
l>r break from the loop 
mid=l+(r-l)/2
value present at mid index in array is our k value -> yes -> true
value at mid index is less than k -> l=mid+1
value at mid index is greater than k -> r=mid-1

false


*/