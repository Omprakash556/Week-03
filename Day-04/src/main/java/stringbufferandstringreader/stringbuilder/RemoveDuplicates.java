package stringbufferandstringreader.stringbuilder;

import java.util.HashSet;

public class RemoveDuplicates {
    public static String removeDuplicate(String word){
        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for(int i=0; i<word.length(); i++){
            if(!set.contains(word.charAt(i))){
                result.append(word.charAt(i));
                set.add(word.charAt(i));
            }
        }
    return result.toString();
    }
    public static void main(String[] args) {
        String word = "Umbrella";
        System.out.println(removeDuplicate(word));

    }
}
