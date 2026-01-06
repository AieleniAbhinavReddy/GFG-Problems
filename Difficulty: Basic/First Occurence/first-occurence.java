class Solution {
    int firstOccurence(String txt, String pat) {
        if(txt.length()==1){//for handling case where txt is of length 1
            if(txt.equals(pat)){
                return 0;
            }else{
                return -1;
            }
        }
        for(int i=0;i<=txt.length()-pat.length();i++){// 0 1 2 3 4 5 6 7 8 9 10 11
            String temp=txt.substring(i,i+pat.length());// i=0 s=0 e=2
            if(temp.equals(pat)){
                return i;
            }
        }
        return -1;
    }
}

/*
Approach : sliding window
components :
loop 
variable
condition




txt = GeeksForGeeks = data
window size = 2 = pat size

Ge, ee, ek, ks, sF, Fo, or, rG, Ge, ee, ek, ks

pat = Fr

output is false
*/