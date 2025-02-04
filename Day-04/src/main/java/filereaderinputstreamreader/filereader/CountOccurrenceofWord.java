package filereaderinputstreamreader.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountOccurrenceofWord {
    public static void main(String[] args) {
        String filePath = "Basic Git Commands.txt";
        int count = 0;
        String inputWord = "new";
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = br.readLine()) != null){
                String[] words = line.split("\\s+");
                for (String word: words){
                    if(word.equalsIgnoreCase(inputWord) ){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
