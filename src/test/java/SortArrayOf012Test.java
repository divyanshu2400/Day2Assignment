
import com.truecodes.SortArrayOf012;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortArrayOf012Test {

    @Test
    public void testSortArray1() {
        int[] input1 = {0, 1, 2, 1, 0, 2, 1, 0};
        SortArrayOf012.sort(input1);
        Assertions.assertArrayEquals(new int[]{0, 0, 0, 1, 1, 1, 2, 2}, input1);
    }

    @Test
    public void testSortArray2() {
        int[] input2 = {2, 1, 0, 1, 2, 0, 1, 0};
        SortArrayOf012.sort(input2);
        Assertions.assertArrayEquals(new int[]{0, 0, 0, 1, 1, 1, 2, 2}, input2);
    }

    @Test
    public void testSortArray3() {
        int[] input3 = {0, 0, 0, 1, 1, 1, 2, 2};
        SortArrayOf012.sort(input3);
        Assertions.assertArrayEquals(new int[]{0, 0, 0, 1, 1, 1, 2, 2}, input3);
    }

    @Test
    public void testSortArray4() {
        int[] input4 = {2, 2, 1, 0};
        SortArrayOf012.sort(input4);
        Assertions.assertArrayEquals(new int[]{0, 1, 2, 2}, input4);
    }

    @Test
    public void testSortArray5() {
        int[] input5 = {1, 1, 1, 1};
        SortArrayOf012.sort(input5);
        Assertions.assertArrayEquals(new int[]{1, 1, 1, 1}, input5);
    }

    @Test
    public void testSortArray6() {
        int[] input6 = {0, 2, 1};
        SortArrayOf012.sort(input6);
        Assertions.assertArrayEquals(new int[]{0, 1, 2}, input6);
    }

    @Test
    public void testSortArray7() {
        int[] input7 = {2, 0};
        SortArrayOf012.sort(input7);
        Assertions.assertArrayEquals(new int[]{0, 2}, input7);
    }

    @Test
    public void testSortArray8() {
        int[] input8 = {};
        SortArrayOf012.sort(input8);
        Assertions.assertArrayEquals(new int[]{}, input8);
    }
}
