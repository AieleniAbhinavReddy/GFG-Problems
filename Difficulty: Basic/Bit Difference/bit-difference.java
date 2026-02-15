class Solution {
    public static int countBitsFlip(int a, int b) {
        int xor=a^b;
        int count=0;
        while(xor>0){
            xor=xor&(xor-1);
            count++;
        }
        return count;
    }
}
/*
Approach:
1)xor operator =>the result is 1 if the bits dosent match else 0 if both bits match
2)declare a xor variale and store the xor outupt in it
3)declare a variable count to count number of 1's in the xor output
4)we use brain karnighan's algorithm =>we continuously perform and operation on the number and number -1 this gives
a number whose right most set bit will be converted to 0
5)we perform this until the number becomes 0
6)final count value is the output
*/
