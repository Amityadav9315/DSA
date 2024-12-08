import java.util.*;

public class MaxswaptoSortArray {

    public static int maxSwapsToSort(int[] arr) {
        int n = arr.length;

        // Pairing array elements with their indices
        Pair[] arrPos = new Pair[n];
        for (int i = 0; i < n; i++) {
            arrPos[i] = new Pair(arr[i], i);
        }

        // Sort the array by element values
        Arrays.sort(arrPos, Comparator.comparingInt(p -> p.value));

        // Visited array to track already sorted positions
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);

        int maxSwaps = 0;

        for (int i = 0; i < n; i++) {
            // If the element is already visited or in the right position, skip it
            if (visited[i] || arrPos[i].index == i) {
                continue;
            }

            // Find the size of the cycle
            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;

                // Move to the next index in the cycle
                j = arrPos[j].index;
                cycleSize++;
            }

            // If there is a cycle, it requires (cycleSize - 1) swaps
            if (cycleSize > 1) {
                maxSwaps += cycleSize - 1;
            }
        }

        return maxSwaps;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        System.out.println("Maximum swaps required to sort the array: " + maxSwapsToSort(arr));
    }

    // Helper class to pair value and index
    static class Pair {
        int value, index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
