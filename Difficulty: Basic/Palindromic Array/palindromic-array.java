/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        for(int n:arr){
            String num=Integer.toString(n);
            String rev=new StringBuilder(num).reverse().toString();
            if(!num.equals(rev)){
                return false;
            }
        }
        return true;
    }
}

/*
Approach : 
we use a loop
string methods
condition

loop = iterate elements in arr one by one
string = checking if a number is palindrome
condition = palindrome checking

111 -> palindrome? -> true
222 -> palindrome? -> true
333 -> palindrome? -> true
20 -> palindrome? -> output false
444 -> palindrome? -> true
555 -> palindrome? -> true

output true


*/