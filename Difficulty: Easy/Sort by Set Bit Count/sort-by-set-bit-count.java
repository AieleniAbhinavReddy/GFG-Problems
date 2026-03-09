// User function Template for Java

class Compute {
    static void sortBySetBitCount(Integer arr[], int n) {
        Arrays.sort(arr,(a,b)->Integer.bitCount(b)-Integer.bitCount(a));
        
    }
}
