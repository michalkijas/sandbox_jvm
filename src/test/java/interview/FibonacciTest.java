package interview;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * https://pl.wikipedia.org/wiki/Ci%C4%85g_Fibonacciego
 */
public class FibonacciTest {

    private final List<Integer> EXPECTED_RESULT = List.of(
            0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181
    );


    @Test
    public void returnListTest() {
        Assert.assertEquals(EXPECTED_RESULT, returnList(20));
    }

    private List<Integer> returnList(int iterations) {
        List<Integer> result = new ArrayList();
        result.add(0);
        if (iterations == 0) {
            return result;
        }
        result.add(1);
        if (iterations == 1) {
            return result;
        }
        int previous = 0;
        int current = 1;
        for (int i = 2; i < iterations; i++) {
            int sum = previous + current;
            previous = current;
            current = sum;
            result.add(sum);
        }
        return result;
    }
    

    @Test
    public void returnValue() {
        Assert.assertEquals(34, returnValue(10));
        Assert.assertEquals(377, returnValue(15));
        Assert.assertEquals(1597, returnValue(18));
    }

    private int returnValue(int iterations) {
        if (iterations <= 1) {
            return iterations;
        }
        int previous = 0;
        int current = 1;
        for (int i = 2; i < iterations; i++) {
            int sum = previous + current;
            previous = current;
            current = sum;
        }
        return current;
    }

}
