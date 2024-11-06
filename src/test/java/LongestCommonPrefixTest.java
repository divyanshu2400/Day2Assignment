import com.truecodes.LongestCommonPrefix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest{

        @Test
        public void testLongestCommonPrefix1() {
            String[] strs1 = {"flower", "flow", "flight"};
            String result1 = LongestCommonPrefix.longestCommonPrefix(strs1);
            System.out.println("Result 1: " + result1);
            Assertions.assertEquals("fl", result1);
        }

        @Test
        public void testLongestCommonPrefix2() {
            String[] strs2 = {"dog", "racecar", "car"};
            String result2 = LongestCommonPrefix.longestCommonPrefix(strs2);
            System.out.println("Result 2: " + result2);
            Assertions.assertEquals("", result2);
        }

        @Test
        public void testLongestCommonPrefix3() {
            String[] strs3 = {"apple", "app", "apricot"};
            String result3 = LongestCommonPrefix.longestCommonPrefix(strs3);
            System.out.println("Result 3: " + result3);
            Assertions.assertEquals("ap", result3);
        }

        @Test
        public void testLongestCommonPrefix4() {
            String[] strs4 = {"", "flow", "flight"};
            String result4 = LongestCommonPrefix.longestCommonPrefix(strs4);
            System.out.println("Result 4: " + result4);
            Assertions.assertEquals("", result4);
        }

        @Test
        public void testLongestCommonPrefix5() {
            String[] strs5 = {};
            String result5 = LongestCommonPrefix.longestCommonPrefix(strs5);
            System.out.println("Result 5: " + result5);
            Assertions.assertEquals("", result5);
        }
    }


