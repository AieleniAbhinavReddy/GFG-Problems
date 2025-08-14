// User function Template for Java

class Solution {
    public int[] common_digits(int[] nums) {
        String str=Arrays.toString(nums);
        String str1=str.replace(",","").replace(" ","").replace("[","").replace("]","");
        HashSet<Integer> set=new LinkedHashSet<>();
        for(char c:str1.toCharArray()){
            set.add(Character.getNumericValue(c));
        }
        int[] res=new int[set.size()];
        int i=0;
        for(int n:set){
            res[i++]=n;
        }
        Arrays.sort(res);
        return res;
    }
}