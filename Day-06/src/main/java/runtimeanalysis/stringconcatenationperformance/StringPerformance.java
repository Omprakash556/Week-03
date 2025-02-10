package runtimeanalysis.stringconcatenationperformance;

public class StringPerformance {
    public static void main(String[] args) {
        String string = "Bridge";
        long startTime = System.nanoTime();
        for (int i=0; i<1000; i++){
            string+="Lab";
        }
        long endTime = System.nanoTime();
        System.out.println("Performance String Concatenation on 1000 Operation: "+(endTime-startTime));

        long startTime2 = System.nanoTime();
        for (int i=0; i<10000; i++){
            string+="Lab";
        }
        long endTime2 = System.nanoTime();
        System.out.println("Performance String Concatenation on 10000 Operation: "+(endTime2-startTime2));
        System.out.println();


        StringBuffer stringBuffer = new StringBuffer("Bridge");;
        long startTimeSB = System.nanoTime();
        for (int i=0; i<1000; i++){
            stringBuffer.append(stringBuffer.charAt(i));
        }
        long endTimeSB = System.nanoTime();
        System.out.println("Performance StringBuffer Concatenation on 1000 Operation: "+(endTimeSB-startTimeSB));
        startTimeSB = System.nanoTime();
        for (int i=0; i<10000; i++){
            stringBuffer.append(stringBuffer.charAt(i));
        }
        endTimeSB = System.nanoTime();
        System.out.println("Performance StringBuffer Concatenation on 10000 Operation: "+(endTimeSB-startTimeSB));
        System.out.println();


        StringBuilder stringBuilder = new StringBuilder("Bridge");;
        startTimeSB = System.nanoTime();
        for (int i=0; i<1000; i++){
            stringBuilder.append(stringBuffer.charAt(i));
        }
        endTimeSB = System.nanoTime();
        System.out.println("Performance StringBuilder Concatenation on 1000 Operation: "+(endTimeSB-startTimeSB));
        startTimeSB = System.nanoTime();
        for (int i=0; i<10000; i++){
            stringBuilder.append(stringBuffer.charAt(i));
        }
        endTimeSB = System.nanoTime();
        System.out.println("Performance StringBuilder Concatenation on 10000 Operation: "+(endTimeSB-startTimeSB));
        System.out.println();
    }
}
