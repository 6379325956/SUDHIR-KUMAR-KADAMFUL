public class ArrayReversal {

    // Method to reverse an array of integers
    public static void reverseArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }
        
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move the pointers towards the center
            start++;
            end--;
        }
    }

    // Method to print the array elements
    public static void printArray(int[] arr) {
        if (arr == null) {
            System.out.println("Array is null.");
            return;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // New line after printing the array
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        printArray(array);

        // Reverse the array
        reverseArray(array);

        System.out.println("Reversed Array:");
        printArray(array);
    }
}
