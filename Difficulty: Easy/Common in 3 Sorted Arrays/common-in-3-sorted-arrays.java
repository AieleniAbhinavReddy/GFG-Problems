// User function Template for Java

class Solution {
    static boolean find(List<Integer> arr,int t){
        int l=0,r=arr.size()-1;
        while(l<=r){
            int m=l+(r-l)/2;
            int c=arr.get(m);
            if(c==t) return true;
            else if(c>t) r=m-1;
            else l=m+1;
        }
        return false;
    }
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,List<Integer> arr3) {
        List<Integer> res=new ArrayList<>();
        for(int n:arr1){
            if(find(arr2,n) && find(arr3,n)){
                if(!res.contains(n)) res.add(n);
            }
        }
        return res;
    }
}