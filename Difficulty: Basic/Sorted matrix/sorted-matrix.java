import java.util.*;

class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        // 1. Create a 1D array to store all elements of the NxN matrix
        int[] temp = new int[N * N];
        int k = 0;

        // 2. Copy elements from 2D matrix to 1D array
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                temp[k++] = Mat[i][j];
            }
        }

        // 3. Sort the 1D array - O(N^2 log(N^2)) which simplifies to O(N^2 log N)
        Arrays.sort(temp);

        // 4. Copy sorted elements back into the 2D matrix
        k = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Mat[i][j] = temp[k++];
            }
        }

        return Mat;
    }
}