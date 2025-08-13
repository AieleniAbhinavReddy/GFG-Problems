
class Solution {
    public void swapKth(List<Integer> arr, int k) {
        if(k>arr.size()) return;
        int r=arr.size()-k;   
        int v1=arr.get(k-1);
        int v2=arr.get(r);
        // System.out.println(v1+" "+v2);
        arr.set(k-1,v2);
        arr.set(r,v1);
    }
}
