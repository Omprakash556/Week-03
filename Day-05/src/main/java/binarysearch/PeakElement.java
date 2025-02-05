package binarysearch;

public class PeakElement {
    public static int peakElement(int[] array) {
        int n = array.length;
        int start = 0;
        int end = n - 1;
        int mid = start + (end - start) / 2;
        while (start < end) {
                if(array[mid] < array[mid+1]){
                    start = mid+1;
                }else {
                    end = mid;
                }

        mid = start + (end - start) / 2;
    }

        return mid;
    }

    public static void main(String[] args) {
        int[] array = {6,7,8,9,10,1,2,3,4,5};
        System.out.println(peakElement(array));
    }
}
