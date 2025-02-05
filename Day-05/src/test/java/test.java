import org.junit.Test;

import static linearsearch.SearchFirstNegativeNumber.firstNegativeNumber;
import static org.junit.Assert.assertEquals;

public class test {
    @Test

    public void firstNegativeNum(){
        int num[] = {2,3,-1,5,6,73,-2,-90};
        int ans = firstNegativeNumber(num);
        assertEquals(ans,2);
    }

@Test
    public void searchSpecificWord(){
        String[] words = {"I am om prakash", "I am from bihar"};
        String target = "bihar";

        assertEquals("bihar","bihar");
    }
}
