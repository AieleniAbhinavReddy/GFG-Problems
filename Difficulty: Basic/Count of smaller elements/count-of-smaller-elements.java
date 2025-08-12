
class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        int c=0;
        for(int n:arr) if(n<=x) c++;
        return c;
    }
}