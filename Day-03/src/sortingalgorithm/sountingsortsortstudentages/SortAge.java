package sortingalgorithm.sountingsortsortstudentages;

public class SortAge {

    public static void ageSortUsingCountingSort(int age[]){
        int largest = age[0];
        for (int i=1; i<age.length; i++){
            if(age[i]>largest){
                largest = age[i];
            }
        }

        int count[] = new int[largest+1];
        for (int i=0; i<age.length; i++){
            count[age[i]]++;
        }
        int j = 0;
        for (int i=0; i< count.length; i++){
            while (count[i]>0){
                age[j] = i;
                j++;
                count[i]--;
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
        int age[] = {10,18,12,16,11,19,14,11,18,15};
        System.out.println("Students age: ");
        printArr(age);
        ageSortUsingCountingSort(age);
        System.out.println("Students age after sorting: ");
        printArr(age);
    }
}
