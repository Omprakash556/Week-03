package stringbufferandstringreader.stringbuffer;

public class CompareStringBufferAndStringBuilder {
public static void compareString(){
    StringBuilder stringBuilder = new StringBuilder();
    long starttime,endtime;
    starttime=System.nanoTime();
    for (int i=0; i<1000000; i++){
        stringBuilder.append("Hello");

    }
    endtime=System.nanoTime();
    System.out.println(endtime-starttime);


    StringBuffer stringBuffer = new StringBuffer();
    long st, et;
    st = System.nanoTime();
    for (int i=0; i<1000000; i++){
        stringBuffer.append("Hello");
    }
    et = System.nanoTime();

    System.out.println(et - st);
}
    public static void main(String[] args) {
        compareString();


    }
}
