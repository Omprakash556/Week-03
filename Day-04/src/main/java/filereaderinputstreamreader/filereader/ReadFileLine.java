package filereaderinputstreamreader.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLine {
    public static void main(String[] args) {

       /* readFileLine();*/
        String filePath = "Basic Git Commands.txt";
        try(BufferedReader br=new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);

            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
