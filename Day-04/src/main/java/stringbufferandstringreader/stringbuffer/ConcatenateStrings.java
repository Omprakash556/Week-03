package stringbufferandstringreader.stringbuffer;

public class ConcatenateStrings {
    public static String  concatenateStrings(String text[]){
        StringBuffer results = new StringBuffer();
        for (int i=0; i<text.length; i++){
            results.append(text[i]);
        }
    return results.toString();
    }
    public static void main(String[] args) {
        String[] text = {"om", "Prakash", "Bihar", "India"};
        System.out.println(concatenateStrings(text));

    }
}
