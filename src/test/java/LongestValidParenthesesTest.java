
import com.truecodes.LongestValidParentheses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestValidParenthesesTest {

    @Test
    public void testLongestValidParentheses1() {
        String input1 = "((()";
        int result1 = LongestValidParentheses.longestValidParentheses(input1);
        Assertions.assertEquals(2, result1);
    }

    @Test
    public void testLongestValidParentheses2() {
        String input2 = ")()())";
        int result2 = LongestValidParentheses.longestValidParentheses(input2);
        Assertions.assertEquals(4, result2);
    }

    @Test
    public void testLongestValidParentheses3() {
        String input3 = "()(()";
        int result3 = LongestValidParentheses.longestValidParentheses(input3);
        Assertions.assertEquals(2, result3);
    }

    @Test
    public void testLongestValidParentheses4() {
        String input4 = "((())";
        int result4 = LongestValidParentheses.longestValidParentheses(input4);
        Assertions.assertEquals(4, result4);
    }

    @Test
    public void testLongestValidParentheses5() {
        String input5 = "()(())";
        int result5 = LongestValidParentheses.longestValidParentheses(input5);
        Assertions.assertEquals(6, result5);
    }

    @Test
    public void testLongestValidParentheses6() {
        String input6 = "(((((()";
        int result6 = LongestValidParentheses.longestValidParentheses(input6);
        Assertions.assertEquals(2, result6);
    }

    @Test
    public void testLongestValidParentheses7() {
        String input7 = "";
        int result7 = LongestValidParentheses.longestValidParentheses(input7);
        Assertions.assertEquals(0, result7);
    }

    @Test
    public void testLongestValidParentheses8() {
        String input8 = "()()()";
        int result8 = LongestValidParentheses.longestValidParentheses(input8);
        Assertions.assertEquals(6, result8);
    }
}
