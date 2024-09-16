class Solution {
     public int myAtoi(String s) {
        int i = 0;
        int sign = 1;
        long a = 0;

        // Step 1: Handle empty string
        if (s == null || s.length() == 0) {
            return 0;
        }

        // Step 2: Skip leading whitespace
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // Step 3: Handle if we've skipped all characters (empty or only whitespace)
        if (i == s.length()) {
            return 0;
        }

        // Step 4: Check for sign
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        // Step 5: Convert string to integer
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            a = a * 10 + (s.charAt(i) - '0');

            // Step 6: Check for overflow
            if (a * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (a * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            i++;
        }

        // Step 7: Return the result considering the sign
        return (int) (a * sign);
    }
}