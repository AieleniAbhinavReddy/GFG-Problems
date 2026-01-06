class Solution {
    static boolean isEven(int n) {
        if(n%2 == 0){
            return true;
        }
        return false;
    }
}

/*
Approach : reminder = 0 -> even
% -> it gives us the reminder of two numbers division
a/b -> c
c=a&b;

n%2 = reminder -> 0 -> even
n%2 = reminder -> 1 -> odd
*/