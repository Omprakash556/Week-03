package linearsearch;

public class SearchSpecificWord {
    public static String searchSpecificWord(String[] words, String target){
        for (String word : words){
            if(word.contains(target)){
                return word;
            }
        }
        return "Not found";
    }
    public static void main(String[] args) {
        String[] words = {"I am om prakash", "I am from bihar"};
        String target = "bihar";

        System.out.println(searchSpecificWord(words, target));
    }
}
