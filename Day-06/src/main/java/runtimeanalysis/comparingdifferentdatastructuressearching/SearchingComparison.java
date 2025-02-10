package runtimeanalysis.comparingdifferentdatastructuressearching;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class SearchingComparison {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10000];
        for (int i=0; i< array.length; i++){
            array[i] = random.nextInt(10000)+1;
        }

        int target = 68709;
        long st = System.nanoTime();
        for (int i=0; i<array.length; i++){
            if(array[i] == target){
                break;
            }
        }
        long et = System.nanoTime();
        System.out.println("Performance time for linear search in array(10000): "+(et-st));

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<10000; i++){
            map.put(i, random.nextInt(10000)+1);
        }

        target = 67687;
        st = System.nanoTime();
        if(map.containsKey(target));
        et = System.nanoTime();

        System.out.println("Performance time for linear search in HashMap(10000): "+(et-st));

        Map<Integer, Integer> map1 = new TreeMap<>();
        for (int i=0; i<10000; i++){
            map1.put(i, random.nextInt(1000)+1);
        }
        target = 87879;
        st = System.nanoTime();
        map1.containsKey(target);
        et = System.nanoTime();

        System.out.println("Performance time for linear search in TreeMap(10000): "+(et-st));
        System.out.println();

        int[] array2 = new int[100000];
        for (int i=0; i< array.length; i++){
            array2[i] = random.nextInt(100000)+1;
        }

        target = 68709;
        st = System.nanoTime();
        for (int i=0; i<array.length; i++){
            if(array2[i] == target){
                break;
            }
        }
        et = System.nanoTime();
        System.out.println("Performance time for linear search in array(100000): "+(et-st));

        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i=0; i<100000; i++){
            map2.put(i, random.nextInt(100000)+1);
        }

        target = 67687;
        st = System.nanoTime();
        if(map.containsKey(target));
        et = System.nanoTime();

        System.out.println("Performance time for linear search in HashMap(100000): "+(et-st));

        Map<Integer, Integer> map3 = new TreeMap<>();
        for (int i=0; i<10000; i++){
            map1.put(i, random.nextInt(1000)+1);
        }
        target = 87879;
        st = System.nanoTime();
        map1.containsKey(target);
        et = System.nanoTime();

        System.out.println("Performance time for linear search in TreeMap(100000): "+(et-st));
    }
}


