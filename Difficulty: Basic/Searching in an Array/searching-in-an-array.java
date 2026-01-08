// User function Template for Java
class Solution {
    public int search(int k, ArrayList<Integer> arr) {
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==k){
                return i+1;
            }
        }
        return -1;
    }
}
/*
Approach
loop 
condition

loop -> iterate the given list sequentially
condition -> to check if current value is equal to k
if equal -> output is the index
k is not found anywhere in arr -> -1
*/