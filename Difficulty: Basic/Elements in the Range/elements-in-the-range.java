// User function Template for Java

class Solution {
    boolean check_elements(int arr[], int n, int A, int B) {
        // int c=0;
        // for(int i:arr){
        //     if(i>=A && i<=B) c++;
        // }
        // if(c<(B-A)+1) return false;
        // return true;
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr) set.add(num);
        for(int i=A;i<=B;i++){
            if(!set.contains(i)) return false;
        }
        return true;
    }
}
