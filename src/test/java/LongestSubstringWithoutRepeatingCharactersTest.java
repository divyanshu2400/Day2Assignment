
import com.truecodes.LongestSubstringWithoutRepeatingCharacters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void testLengthOfLongestSubstring1() {
        String input1 = "ABCBC";
        int result1 = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input1);
        Assertions.assertEquals(3, result1);
    }

    @Test
    public void testLengthOfLongestSubstring2() {
        String input2 = "AAA";
        int result2 = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input2);
        Assertions.assertEquals(1, result2);
    }

    @Test
    public void testLengthOfLongestSubstring3() {
        String input3 = "ABCADEF";
        int result3 = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input3);
        Assertions.assertEquals(6, result3);
    }

    @Test
    public void testLengthOfLongestSubstring4() {
        String input4 = "ABABBB";
        int result4 = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input4);
        Assertions.assertEquals(2, result4);
    }

    @Test
    public void testLengthOfLongestSubstring5() {
        String input5 = "PQRSTUVPQR";
        int result5 = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input5);
        Assertions.assertEquals(7, result5);
    }

    @Test
    public void testLengthOfLongestSubstring6() {
        String input6 = "ABCDEFG";
        int result6 = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input6);
        Assertions.assertEquals(7, result6);
    }

    @Test
    public void testLengthOfLongestSubstring7() {
        String input7 = "";
        int result7 = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input7);
        Assertions.assertEquals(0, result7);
    }
}
