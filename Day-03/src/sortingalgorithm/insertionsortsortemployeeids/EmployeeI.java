package sortingalgorithm.insertionsortsortemployeeids;


public class EmployeeI {

    public static void employeeSortUsingInsertion(int employeeID[]){
        int n = employeeID.length;
        for (int i=1; i<n; i++){
            int firstIdx = i;
            while (firstIdx > 0 && employeeID[firstIdx-1] > employeeID[firstIdx]){
                // swap
                int temp = employeeID[firstIdx-1];
                employeeID[firstIdx-1] = employeeID[firstIdx];
                employeeID[firstIdx] = temp;
                firstIdx--;
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
        int employeeID[] = {67, 94, 30, 89, 56, 43};
        System.out.println("Employee ID: ");
        printArr(employeeID);
        employeeSortUsingInsertion(employeeID);
        System.out.println("Employee Id after sorting: ");
        printArr(employeeID);

    }
}
