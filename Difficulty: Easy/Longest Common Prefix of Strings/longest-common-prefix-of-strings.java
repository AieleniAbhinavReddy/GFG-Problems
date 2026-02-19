// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        if (arr == null || arr.length == 0) return "";

        // Start with the first string as prefix
        String prefix = arr[0];

        // Compare with each string
        for (int i = 1; i < arr.length; i++) {
            while (arr[i].indexOf(prefix) != 0) {
                // Shorten prefix until it matches
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}