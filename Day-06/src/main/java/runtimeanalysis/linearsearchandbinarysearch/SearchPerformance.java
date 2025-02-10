package runtimeanalysis.linearsearchandbinarysearch;

import java.util.Random;

public class SearchPerformance {

    public static int findLinearSearch(int[] array, int target){
        for (int i=0; i<array.length; i++){
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int findBinarySearch(int[] array, int si, int ei,  int target){
        while (si<=ei){
            int mid = si+(ei-si)/2;
            if(array[mid] == target){
                return mid;
            }else if(array[mid] > target){
                ei = mid-1;
            }else si = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100000];
        for (int i=0; i< array.length; i++){
            array[i] = random.nextInt(100000)-1;
        }

        int target = 2786989;
        long st = System.nanoTime();
        int result = findLinearSearch(array, target);
        long et = System.nanoTime();
        System.out.println("Time taking in linear search: "+(et-st));

         target = 2786989;
         st = System.nanoTime();
         result = findBinarySearch(array,0, array.length-1, target);
         et = System.nanoTime();
        System.out.println("Time taking in linear search: "+(et-st));
    }
}
