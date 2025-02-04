package stringbufferandstringreader.stringbuilder;

public class ReverseAString {
    public static String reverseString(String text){
        StringBuilder result = new StringBuilder();
        for (int i=0; i<text.length(); i++){
            result.append(text.charAt(i));
        }
       return result.reverse().toString();
    }
    public static void main(String[] args) {
        String text = "Hello";
        System.out.println(reverseString(text));

    }
}
