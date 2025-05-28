// Leetcode-7 Reverse Integer

class Solution {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int rem = x % 10;

            // Check for overflow before updating the result
            if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) {
                return 0;
            }

            result = result * 10 + rem;
            x = x / 10;
        }

        return result;
    }
}
