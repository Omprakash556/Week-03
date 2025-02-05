package binarysearch;

public class SearchTargetIn2D {
    public static boolean findTargetIn2D(int[][] array, int target){
        int n=array.length;
        int m=array[0].length;
        int end=n*m;
        int st = 0;
        while (st <end){
            int mid = st+(end-st)/2;
            int row = mid/array[0].length;
            int col = mid%array[0].length;
            if(array[row][col] == target){
                return true;
            }
            else if(target > array[row][col]){
                st = mid+1;
            }else {
                end = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int target = 6;

        boolean result = findTargetIn2D(arr, target);
        if(result){
            System.out.println("Target present: ");
        }else {
            System.out.println("Not present..");
        }
    }
}
