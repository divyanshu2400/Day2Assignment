
import com.truecodes.IncrementLargeInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IncrementLargeIntegerTest {

    @Test
    public void testIncrement1() {
        int[] digits1 = {1, 2, 3};
        int[] result1 = IncrementLargeInteger.increment(digits1);
        Assertions.assertArrayEquals(new int[]{1, 2, 4}, result1);
    }

    @Test
    public void testIncrement2() {
        int[] digits2 = {4, 3, 2, 1};
        int[] result2 = IncrementLargeInteger.increment(digits2);
        Assertions.assertArrayEquals(new int[]{4, 3, 2, 2}, result2);
    }

    @Test
    public void testIncrement3() {
        int[] digits3 = {9, 9, 9};
        int[] result3 = IncrementLargeInteger.increment(digits3);
        Assertions.assertArrayEquals(new int[]{1, 0, 0, 0}, result3);
    }

    @Test
    public void testIncrement4() {
        int[] digits4 = {1, 9, 9, 9};
        int[] result4 = IncrementLargeInteger.increment(digits4);
        Assertions.assertArrayEquals(new int[]{2, 0, 0, 0}, result4);
    }

    @Test
    public void testIncrement5() {
        int[] digits5 = {0};
        int[] result5 = IncrementLargeInteger.increment(digits5);
        Assertions.assertArrayEquals(new int[]{1}, result5);
    }

    @Test
    public void testIncrement6() {
        int[] digits6 = {9};
        int[] result6 = IncrementLargeInteger.increment(digits6);
        Assertions.assertArrayEquals(new int[]{1, 0}, result6);
    }

    @Test
    public void testIncrement7() {
        int[] digits7 = {1, 9, 9, 9, 9};
        int[] result7 = IncrementLargeInteger.increment(digits7);
        Assertions.assertArrayEquals(new int[]{2, 0, 0, 0, 0}, result7);
    }
}
