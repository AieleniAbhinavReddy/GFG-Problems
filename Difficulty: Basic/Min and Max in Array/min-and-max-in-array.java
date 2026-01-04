class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        ArrayList<Integer> res=new ArrayList<>();
        int min=arr[0],max=arr[0];
        for(int n:arr){
            if(min>n){
                min=n;
            }
            if(max<n){
                max=n;
            }
        }
        res.add(min);
        res.add(max);
        return res;
    }
}

/*
Approach :

use two variables min=1st value and max= 1st value
a normal for loop
using two conditions 
one condition is min>curr -> min=curr
another condition is max<curr -> max=curr

arr = [12, 3, 15, 7, 9]

min=12 , max=12

12 -> min>12 -> nothing -> max<12 -> nothing
3 -> min>3 -> min=3 -> max<3 -> nothing
15 -> min>15 -> min=3 -> max<15 -> max=15
7 -> min>7 -> min=3 -> max<7 -> max=15
9 -> min>9 -> min=3 -> max<9 -> max=15

min =3 , max=15
res = {min,max}

output res

*/