class Solution {
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,List<Integer> arr3) {
        List<Integer> res=new ArrayList<>();
        int i=0,j=0,k=0,l1=arr1.size(),l2=arr2.size(),l3=arr3.size();
        while(i<l1 && j<l2 && k<l3){
            int a=arr1.get(i),b=arr2.get(j),c=arr3.get(k);
            if(a==b && b==c){
                if(!res.contains(a)) res.add(a);
                i++;
                j++;
                k++;
            }else if(a<=b && a<=c) i++;
            else if(b<=a && b<=c) j++;
            else k++;
        }
        return res;
    }
}
/*
Approach:
things used:
loops
conditions
array list
variables

steps:
1)declare the variables to track current index for all arrays
2)while loop to iterate all the 3 arrays at a time
3)check if the 3 current elements are equal
4)then add one element to result and increment all 3 index variables
5)if arr 1 element is smallest then increment it by one
6)if arr 2 element is smallest then increment it by one
7)so increment arr 3 index by one
8)we got out output in the res array to return it as output

*/