package runtimeanalysis.largefilereadingefficiency;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingEfficiency {

    public static void fileReader(String fileName) {
        try (FileReader fileReader = new FileReader(fileName)) {
            int text;
            while ((text = fileReader.read()) != -1) {

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void inputStreamReader(String filename) {
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filename))) {
            int text;
            while ((text = inputStreamReader.read()) != -1) {
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        long st = System.nanoTime();
        fileReader("100 MB File");
        long et = System.nanoTime();

        System.out.println("Time taking for fileReader for 100 MB file: " + (et - st));

        st = System.nanoTime();
        inputStreamReader("100 MB File");
        et = System.nanoTime();
        System.out.println("Time taking for input Stream Reader of 100 MB file: " + (et - st));
    }
}