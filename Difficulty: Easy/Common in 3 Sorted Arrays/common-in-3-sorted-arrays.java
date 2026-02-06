class Solution {
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,List<Integer> arr3) {
        List<Integer> res=new ArrayList<>();
        int i=0,j=0,k=0,n1=arr1.size(),n2=arr2.size(),n3=arr3.size();
        while(i<n1 && j<n2 && k<n3){
            int a=arr1.get(i),b=arr2.get(j),c=arr3.get(k);
            if(a==b && b==c){
                if(!res.contains(a)) res.add(a);
                i+=1;
                j+=1;
                k+=1;
            } 
            else if(a<=b && a<=c) i+=1;
            else if(b<=a && b<=c) j+=1;
            else k+=1;
        }
        return res;
    }
}