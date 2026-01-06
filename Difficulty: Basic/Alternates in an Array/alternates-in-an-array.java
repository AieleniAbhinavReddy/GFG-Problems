class Solution {
    // function to print alternate elements of an array
    public ArrayList<Integer> getAlternates(int arr[]) {
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<arr.length;i=i+2){
            res.add(arr[i]);
        }
        return res;
    }
}

/*
Approach :
a loop
a list to store output

[1, 2, 3, 4, 5]

i=0 + 2
i=2 + 2
i=4 + 2
i=6

loop properties : 
begin : i=0 
end : i<size of array
i increased by 2

go on adding the values at i into output list
*/