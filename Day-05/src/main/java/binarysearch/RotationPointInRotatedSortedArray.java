package binarysearch;

public class RotationPointInRotatedSortedArray {
    public static int rotationPoint(int[] arr){
        int n = arr.length;
        int low = 0, high = n-1;
        int mid = low+(high-low)/2;
        while (low <high){
            if(arr[mid] >arr[0]) {
                low = mid+1;
            }else{
                high = mid;
            }
            mid = low+(high-low)/2;
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 9,10,11, 12, 13, 14, 1, 2, 3, 4, 5, 6 };
        System.out.println(rotationPoint(arr));
    }
}
