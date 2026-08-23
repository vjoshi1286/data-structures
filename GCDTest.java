import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test cases for GCD class
 * Tests both iterative and recursive GCD implementations
 */
public class GCDTest {

    /**
     * Test gcdIterative with basic positive numbers
     */
    @Test
    public void testGcdIterativeBasic() {
        assertEquals(6, GCD.gcdIterative(48, 18));
        assertEquals(50, GCD.gcdIterative(100, 50));
        assertEquals(1, GCD.gcdIterative(17, 19));
    }

    /**
     * Test gcdIterative with one number being zero
     */
    @Test
    public void testGcdIterativeWithZero() {
        assertEquals(5, GCD.gcdIterative(0, 5));
        assertEquals(5, GCD.gcdIterative(5, 0));
    }

    /**
     * Test gcdIterative with both numbers zero
     */
    @Test
    public void testGcdIterativeBothZero() {
        assertEquals(0, GCD.gcdIterative(0, 0));
    }

    /**
     * Test gcdIterative with negative numbers
     */
    @Test
    public void testGcdIterativeNegative() {
        assertEquals(6, GCD.gcdIterative(-48, 18));
        assertEquals(6, GCD.gcdIterative(48, -18));
        assertEquals(6, GCD.gcdIterative(-48, -18));
    }

    /**
     * Test gcdIterative with same numbers
     */
    @Test
    public void testGcdIterativeSameNumbers() {
        assertEquals(48, GCD.gcdIterative(48, 48));
    }

    /**
     * Test gcdRecursive with basic positive numbers
     */
    @Test
    public void testGcdRecursiveBasic() {
        assertEquals(6, GCD.gcdRecursive(48, 18));
        assertEquals(50, GCD.gcdRecursive(100, 50));
        assertEquals(1, GCD.gcdRecursive(17, 19));
    }

    /**
     * Test gcdRecursive with one number being zero
     */
    @Test
    public void testGcdRecursiveWithZero() {
        assertEquals(5, GCD.gcdRecursive(0, 5));
        assertEquals(5, GCD.gcdRecursive(5, 0));
    }

    /**
     * Test gcdRecursive with both numbers zero
     */
    @Test
    public void testGcdRecursiveBothZero() {
        assertEquals(0, GCD.gcdRecursive(0, 0));
    }

    /**
     * Test gcdRecursive with negative numbers
     */
    @Test
    public void testGcdRecursiveNegative() {
        assertEquals(6, GCD.gcdRecursive(-48, 18));
        assertEquals(6, GCD.gcdRecursive(48, -18));
        assertEquals(6, GCD.gcdRecursive(-48, -18));
    }

    /**
     * Test gcdRecursive with same numbers
     */
    @Test
    public void testGcdRecursiveSameNumbers() {
        assertEquals(48, GCD.gcdRecursive(48, 48));
    }

    /**
     * Test that both methods produce the same results
     */
    @Test
    public void testBothMethodsConsistent() {
        int[][] testCases = {{60, 48}, {100, 50}, {17, 19}, {0, 5}, {-48, 18}, {100, 100}};
        
        for (int[] testCase : testCases) {
            int iterativeResult = GCD.gcdIterative(testCase[0], testCase[1]);
            int recursiveResult = GCD.gcdRecursive(testCase[0], testCase[1]);
            assertEquals(iterativeResult, recursiveResult, 
                "Iterative and Recursive results differ for inputs: " + testCase[0] + ", " + testCase[1]);
        }
    }
}
