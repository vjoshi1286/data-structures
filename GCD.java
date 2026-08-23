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
    public static int gcdIterative(final int a, final int b) {
        final int absA = Math.abs(a);
        final int absB = Math.abs(b);
        
        int dividend = absA;
        int divisor = absB;
        
        while (divisor != 0) {
            final int remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        return dividend;
    }
    
    /**
     * Calculate GCD using the recursive Euclidean algorithm.
     * 
     * @param a First number
     * @param b Second number
     * @return Greatest Common Divisor of a and b
     */
    public static int gcdRecursive(final int a, final int b) {
        final int absA = Math.abs(a);
        final int absB = Math.abs(b);
        
        if (absB == 0) {
            return absA;
        }
        return gcdRecursive(absB, absA % absB);
    }
}
