// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        int c=0;
        int num=n;
        while(num>0){
            int rem=num%10;
            if(rem!=0 && n%rem==0) c++;
            num/=10;
        }
        return c;
    }
}