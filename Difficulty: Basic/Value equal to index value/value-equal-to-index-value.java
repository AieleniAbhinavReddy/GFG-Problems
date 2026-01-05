// User function Template for Java

class Solution {
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.size();i++){
            if(nums.get(i) == i+1){
                res.add(i+1);
            }
        }
        return res;
    }
}

/*
Approach:
[15, 2, 45, 4 , 7] , i=0

15 -> 15 = 1 -> nothing
2 -> 2 = 2 -> add to res
45 -> 45 = 3 -> nothing
4 -> 4 = 4 -> add to res
7 -> 7 = 5 -> nothing

res=2,4
*/