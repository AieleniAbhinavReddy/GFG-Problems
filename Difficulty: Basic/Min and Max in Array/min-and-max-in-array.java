// User function Template for Java
// User function Template for Java

/*
class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

Java users need to return result in Pair class
For Example -> return new Pair(minimum,maximum)
*/

class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        int min=arr[0],max=arr[0];
        for(int n:arr){
            if(n>max) max=n;
            if(n<min) min=n;
        }
        Pair<Integer,Integer> res=new Pair<>(min,max);
        return res;
    }
}
