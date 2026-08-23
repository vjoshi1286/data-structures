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
    
    /**
     * Main method to demonstrate GCD implementations
     */
    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;
        
        System.out.println("GCD of " + num1 + " and " + num2 + " (Iterative): " + gcdIterative(num1, num2));
        System.out.println("GCD of " + num1 + " and " + num2 + " (Recursive): " + gcdRecursive(num1, num2));
        
        System.out.println("\nMore examples:");
        
        // Test cases
        int[][] testCases = {{60, 48}, {100, 50}, {17, 19}, {0, 5}};
        
        for (int[] testCase : testCases) {
            int result = gcdIterative(testCase[0], testCase[1]);
            System.out.println("GCD(" + testCase[0] + ", " + testCase[1] + ") = " + result);
        }
    }
}
