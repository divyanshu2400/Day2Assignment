import com.truecodes.SmallestWindow;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmallestWindowTest {

    @Test
    public void testFindSmallestWindow1() {
        String input1 = "abca";
        int result1 = SmallestWindow.findSmallestWindow(input1);
        Assertions.assertEquals(4, result1);
    }

    @Test
    public void testFindSmallestWindow2() {
        String input2 = "aaaa";
        int result2 = SmallestWindow.findSmallestWindow(input2);
        Assertions.assertEquals(1, result2);
    }

    @Test
    public void testFindSmallestWindow3() {
        String input3 = "aabcbcdbca";
        int result3 = SmallestWindow.findSmallestWindow(input3);
        Assertions.assertEquals(4, result3);
    }

    @Test
    public void testFindSmallestWindow4() {
        String input4 = "xyzxyz";
        int result4 = SmallestWindow.findSmallestWindow(input4);
        Assertions.assertEquals(3, result4);
    }

    @Test
    public void testFindSmallestWindow5() {
        String input5 = "abcabcbb";
        int result5 = SmallestWindow.findSmallestWindow(input5);
        Assertions.assertEquals(3, result5);
    }

    @Test
    public void testFindSmallestWindow6() {
        String input6 = "abcde";
        int result6 = SmallestWindow.findSmallestWindow(input6);
        Assertions.assertEquals(5, result6);
    }

    @Test
    public void testFindSmallestWindow7() {
        String input7 = "aaabbcc";
        int result7 = SmallestWindow.findSmallestWindow(input7);
        Assertions.assertEquals(3, result7);
    }

    @Test
    public void testFindSmallestWindow8() {
        String input8 = "a";
        int result8 = SmallestWindow.findSmallestWindow(input8);
        Assertions.assertEquals(1, result8);
    }
}
