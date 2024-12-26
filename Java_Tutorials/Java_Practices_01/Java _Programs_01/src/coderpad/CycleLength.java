package coderpad;

import java.util.HashSet;
import java.util.Set;

public class CycleLength {

	public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 5, 6, 3}; // Example with a cycle
        int start = 0; // Starting index
        int cycleLength = findCycleLength(arr, start);
        System.out.println("Cycle Length: " + cycleLength);
    }

    private static int findCycleLength(int[] arr, int start) {
        Set<Integer> visited = new HashSet<>();
        int current = start;
        int steps = 0;

        while (current >= 0 && current < arr.length) {
            if (visited.contains(current)) {
                // Cycle detected
                int cycleStart = current;
                int length = 0;
                do {
                    length++;
                    current = arr[current];
                } while (current != cycleStart);
                return length;
            }
            visited.add(current);
            current = arr[current];
            steps++;
        }

        return 0; // No cycle found
    }
}
