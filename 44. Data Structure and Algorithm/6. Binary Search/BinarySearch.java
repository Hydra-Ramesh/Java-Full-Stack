public class BinarySearch {
    // Method to perform Binary Search
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate mid index

            // Check if the key is at the middle
            if (arr[mid] == key) {
                return mid;
            }
            // If key is smaller, search in the left half
            else if (arr[mid] > key) {
                right = mid - 1;
            }
            // If key is greater, search in the right half
            else {
                left = mid + 1;
            }
        }
        return -1; // Key not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70}; // Sorted array
        int key = 40;

        int result = binarySearch(numbers, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
