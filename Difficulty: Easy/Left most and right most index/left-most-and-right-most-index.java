// User function Template for Java

/*
class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
*/

class Solution {

    public pair indexes(long v[], long x) {
        int f=-1,l=-1;
        for(int i=0;i<v.length;i++){
            if(v[i]==x){
                if(f==-1){
                    f=i;
                }else{
                    l=i;
                }
            }
        }
        if(l==-1 && f!= -1) l=f;
        pair p=new pair(f,l);
        return p;
    }
}