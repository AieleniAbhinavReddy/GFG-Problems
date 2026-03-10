class Solution {
    public int minFlips(String s) {
        int flip1=0,flip2=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                if(s.charAt(i)=='0') flip2++;
                else flip1++;
            }else{
                if(s.charAt(i)=='0') flip1++;
                else flip2++;
            }
        }
        return Math.min(flip1,flip2);
    }
}