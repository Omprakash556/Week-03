package sortingalgorithm.mergesortsortanarrayofbookprices;

import java.util.ArrayList;

public class BookPriceSorting {

    public static void sortPriceUsingMergeSort(int price[], int low, int high){
        if(low >= high){
            return;
        }
        int mid = (low+high)/2;
        sortPriceUsingMergeSort(price, low, mid);
        sortPriceUsingMergeSort(price, mid+1, high);
        mergeArray(price, low, mid, high);
    }

    public static void mergeArray(int price[], int low, int mid, int high){
        ArrayList<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while (left <= mid && right <= high){
            if(price[left] <= price[right]){
                list.add(price[left]);
                left++;
            }else {
                list.add(price[right]);
                right++;
            }

        }

        while (left <= mid){
            list.add(price[left]);
            left++;
        }
        while (right <= high){
            list.add(price[right]);
            right++;
        }

        for (int i=low; i<=high; i++){
            price[i] = list.get(i-low);
        }
    }

    public static void printArr(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int price[] = {12,34,66,87,22,7,11,2,34,22,34,67,3};
        System.out.println("Price of Books: ");
        printArr(price);
        sortPriceUsingMergeSort(price, 0, price.length-1);
        System.out.println("After use merge sort price of book: ");
        printArr(price);
    }
}
