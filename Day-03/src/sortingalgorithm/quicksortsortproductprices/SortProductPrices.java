package sortingalgorithm.quicksortsortproductprices;

public class SortProductPrices {
    public static void sortProductPriceUsingQuick(int productPrice[], int low, int high){
        if(low < high){
            int partitionIndex = quickSort(productPrice, low, high);
            sortProductPriceUsingQuick(productPrice, low, partitionIndex - 1);
            sortProductPriceUsingQuick(productPrice, partitionIndex + 1, high);
        }
    }

    public static int quickSort(int productPrice[], int low, int high){
        int pivot = productPrice[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (productPrice[i] <= pivot && i < high) {
                i++;
            }
            while (productPrice[j] > pivot && j > low) {
                j--;
            }
            if (i < j) {
                int temp = productPrice[i];
                productPrice[i] = productPrice[j];
                productPrice[j] = temp;
            }
        }

        // Swap the pivot element with the element at position `j`
        int temp = productPrice[low];
        productPrice[low] = productPrice[j];
        productPrice[j] = temp;

        return j; // Return the partition index
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int productPrice[] = {12, 34, 56, 78, 11, 43, 3, 45, 6, 2, 4, 67, 22, 13};
        System.out.println("Product price: ");
        printArr(productPrice);
        sortProductPriceUsingQuick(productPrice, 0, productPrice.length - 1); // Correct the high index
        System.out.println("After applying QuickSort on product price: ");
        printArr(productPrice);
    }
}

