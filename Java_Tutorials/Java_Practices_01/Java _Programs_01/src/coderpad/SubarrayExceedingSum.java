package coderpad;
public class SubarrayExceedingSum {
	public  static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 19};
        int sum = 51;
        
        int minLength = findMinSubarray(arr, sum);
        
        if (minLength == Integer.MAX_VALUE) {
            System.out.println("No subarray found with sum greater than " + sum);
        } else {
            System.out.println("Minimum length of subarray with sum greater than " + sum + " is: " + minLength);
        }
    }

    // Method to find the smallest subarray with a sum greater than the given sum
    private static int findMinSubarray(int[] arr, int sum) {
        int n = arr.length;
        int currentSum = 0;
        int minLength = Integer.MAX_VALUE;

        int start = 0; // Left pointer for the sliding window

        for (int end = 0; end < n; end++) {
            currentSum += arr[end]; // Add the current element to the window

            // Shrink the window from the left if the sum exceeds the given sum
            while (currentSum > sum) {
                minLength = Math.min(minLength, end - start + 1);
                currentSum -= arr[start]; // Remove the element at the left
                start++; // Move the left pointer forward
            }
        }

        return minLength;
    }
}
