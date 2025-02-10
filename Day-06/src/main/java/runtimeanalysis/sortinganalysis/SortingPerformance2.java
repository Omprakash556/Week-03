package runtimeanalysis.sortinganalysis;

import java.util.ArrayList;
import java.util.Random;

public class SortingPerformance2 {
    // ---------------------------------------------------------------------------------//
    public static int[] findbubbleSort(int[] array){
        for (int i=0; i<array.length; i++){
            for (int j=1; j<array.length-i-1; j++){
                if(array[j] < array[j-1]){
                    // swap
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;

                }
            }
        }
        return array;
    }

    /*------------------------------------------------------------------------------*/
    public static void findMergeSort(int[] array, int si,int ed){
        if(si >= ed){
            return ;
        }
        int mid = si+(ed-si)/2;
        findMergeSort(array, si, mid);
        findMergeSort(array, mid+1, ed);
        merge(array, si, mid, ed);
    }
    public static void merge(int[] array, int si, int mid, int ed){
        ArrayList<Integer> list = new ArrayList<>();
        int left = si;
        int right = mid+1;

        while (left <= mid && right <= ed){
            if(array[left] > array[right]){
                list.add(array[right]);
                right++;
            }else {
                list.add(array[left]);
                left++;
            }
        }
        while (left <= mid){
            list.add(array[left]);
            left++;
        }
        while (right <= ed){
            list.add(array[right]);
            right++;
        }

        for (int i=si; i<=ed; i++){
            array[i] = list.get(i-si);
        }
    }

    // ----------------------------------------------------------------//
    public static void findQuickSort(int[] array, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pIdx = partition(array, ei);
        findQuickSort(array, si, pIdx - 1);
        findQuickSort(array, pIdx + 1, ei);
    }

    public static int partition(int[] array,int ei){
        int pivot = array[ei];
        int i = -1;
        for (int j=0; j<ei; j++){
            if(array[j]<= pivot){
                i++;
                // swap
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        i++;
        // swap
        array[ei] = array[i];
        array[i] = pivot;
        return i;
    }

    public static void main(String[] args) {
        // Take random input up to 100000
        Random random = new Random();
        int[] array = new int[1000];
        for (int i=0; i< array.length; i++){
            array[i] = random.nextInt(1000)+1;
        }


// Bubble sort performance checking

        long bubbleSortST = System.nanoTime();
        int[] bubbleSort = findbubbleSort(array);

        for (int j : bubbleSort) {
            System.out.print(j + " ");
        }
        System.out.println();
        long bubbleSortET = System.nanoTime();
        System.out.println("Timing performance of Bubble Sort: "+(bubbleSortET-bubbleSortST));

//        // Merge sort performance checking
        long mergeSortSt = System.nanoTime();
        int[] mergeSortArray=array.clone();
        findMergeSort(mergeSortArray, 0, array.length - 1);
        long mergeSortEt = System.nanoTime();
        for (int j : mergeSortArray) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Timing performance of Merge sort: "+(mergeSortEt - mergeSortSt));


        // Quick sort performance checking
        long quickSortSt = System.nanoTime();
        int[] quickSortArray=array.clone();
        findQuickSort(array, 0, array.length-1);
        long quickSortEi = System.nanoTime();
        for (int j : quickSortArray) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Timing performance of quick sort: "+(quickSortEi - quickSortSt));

    }
}


