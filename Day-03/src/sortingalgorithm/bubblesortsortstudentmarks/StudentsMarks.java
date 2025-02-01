package sortingalgorithm.bubblesortsortstudentmarks;

public class StudentsMarks {
    public static void bubbleMaintainMarks(int arr[]){
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int marks[] = {67, 94, 30, 89, 56, 43};
        System.out.println("Marks before sorting. ");
        printArr(marks);
        bubbleMaintainMarks(marks);
        System.out.println("Marks after sorting. ");
        printArr(marks);
    }
}
