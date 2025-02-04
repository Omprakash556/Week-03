
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static stringbufferandstringreader.stringbuffer.ConcatenateStrings.concatenateStrings;
import static stringbufferandstringreader.stringbuilder.RemoveDuplicates.removeDuplicate;
import static stringbufferandstringreader.stringbuilder.ReverseAString.reverseString;

public class test {
    @Test

      public  void checkReverseString(){
        String str = reverseString("Hello");
        assertEquals("olleH",str);

    }


    @Test
    public void checkRemoveDuplicates(){
        String real = removeDuplicate("Umbrella");
        assertEquals("Umbrela", real);
    }

    @Test
    public void checkconcatenateStrings(){
        String []ans={"om", "Prakash", "Bihar", "India"};
        String res=concatenateStrings(ans);
        assertEquals(res,"omPrakashBiharIndia");
    }
}

