package sortingalgorithm.selectionsortsortexamscores;

public class ExamScore {
    public static void examScoreUsingSelectionSort(int score[]){
        for (int i=0; i< score.length-1; i++){
            int smallest = i;
            for (int j = i+1; j<score.length; j++){
                if(score[smallest ] > score[j]){
                    smallest = j;
                }
            }
            // swap
            int temp = score[smallest];
            score[smallest] = score[i];
            score[i] = temp;
        }
    }
    public static void printArr(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int score[] = {67, 94, 30, 89, 56, 43};
        System.out.println("Exam score:  ");
        printArr(score);
        examScoreUsingSelectionSort(score);
        System.out.println("Exam score after sorting. ");
        printArr(score);
    }
}
