package sortingalgorithm.HeapSort;

public class HeapSort {

    // Function to heapify a subtree rooted at index i
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;  // Initialize largest as root
        int left = 2 * i + 1;  // Left child index
        int right = 2 * i + 2;  // Right child index

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root, swap and heapify the affected subtree
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    // Function to implement heap sort
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build a Max Heap by heapifying all non-leaf nodes
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements one by one from the heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Reheapify the reduced heap
            heapify(arr, i, 0);
        }
    }

    // Example usage:
    public static void main(String[] args) {
        int[] salaryDemands = {45000, 70000, 50000, 60000, 80000, 55000};

        System.out.println("Original Salary Demands:");
        for (int salary : salaryDemands) {
            System.out.print(salary + " ");
        }

        heapSort(salaryDemands);

        System.out.println("\nSorted Salary Demands in Ascending Order:");
        for (int salary : salaryDemands) {
            System.out.print(salary + " ");
        }
    }
}

