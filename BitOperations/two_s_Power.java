//leetcode 231
class two_s_Power {
    public boolean isPowerOfTwo(int n) {
        // Approach 1: Iterative Division
        // if (n == 1) {
        //     return true; // 1 is 2^0, so it's a power of 2
        // }
        // if (n <= 0) {
        //     return false; // Negative numbers and 0 are not powers of 2
        // }
        // while (n > 1) {
        //     if (n % 2 != 0) { // If n is not divisible by 2, it's not a power of 2
        //         return false;
        //     }
        //     n = n / 2; // Divide n by 2 and continue the check
        // }
        // return true; // If we reach here, n was divisible by 2 all the way down to 1

        // Approach 2: Logarithmic Check
        // return Math.ceil(Math.log(n) / Math.log(2)) == Math.floor(Math.log(n) / Math.log(2));
        // This checks if log base 2 of n is an integer

        // Approach 3: Bitwise Operation (most efficient)
        return n > 0 && (n & (n - 1)) == 0; // 0 is explicitly checked with '== 0'
    }

    public static void main(String[] args) {
        two_s_Power solution = new two_s_Power();

        // Test cases
        int[] testNumbers = {1, 2, 3, 4, 8, 16, 18, 32, 64, 0, -1, 1024};

        for (int n : testNumbers) {
            boolean result = solution.isPowerOfTwo(n);
            System.out.println("Is " + n + " a power of 2 = " + result);
        }
    }
}

