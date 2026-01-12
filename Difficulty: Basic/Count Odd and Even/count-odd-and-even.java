class Solution {
    public int[] countOddEven(int[] arr) {
        int[] res=new int[2];
        int ec=0,oc=0;
        for(int n:arr){
            if(n%2==0){
                ec++;
            }else{
                oc++;
            }
        }
        res[0]=oc;
        res[1]=ec;
        return res;
    }
}
/*
Approach
loop
condition
two variables
a integer array of size 2

loop-> we go through each and every element in the array
condition -> to check if the element is even or odd
if element is even -> increase the even count by 1
if element is odd -> increase the odd count by 1

after completion of loop -> add the counts to integer variables
*/