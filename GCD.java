/**
 * Greatest Common Divisor (GCD) Implementation
 * Finds the largest positive integer that divides both numbers without a remainder.
 */

public class GCD {
    
    /**
     * Calculate GCD using the iterative Euclidean algorithm.
     * 
     * @param a First number
     * @param b Second number
     * @return Greatest Common Divisor of a and b
     */
    public static int gcdIterative(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    /**
     * Calculate GCD using the recursive Euclidean algorithm.
     * 
     * @param a First number
     * @param b Second number
     * @return Greatest Common Divisor of a and b
     */
    public static int gcdRecursive(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        
        if (b == 0) {
            return a;
        }
        return gcdRecursive(b, a % b);
    }
}
