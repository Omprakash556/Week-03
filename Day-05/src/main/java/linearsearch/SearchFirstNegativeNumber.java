package linearsearch;

public class SearchFirstNegativeNumber {
    public static int firstNegativeNumber(int[] num){
        for ( int i=0; i<num.length; i++){
            if(num[i] < 0){
              return i;
            }
        }
       return -1;
    }
    public static void main(String[] args) {
        int[] num = {2,3,-1,5,6,73,-2,-90};

        int index = firstNegativeNumber(num);
        System.out.println(index);
    }
}
