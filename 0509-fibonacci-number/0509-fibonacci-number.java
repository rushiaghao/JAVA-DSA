class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        
        int prev2 = 0; // F(0)
        int prev1 = 1; // F(1)
        int current = 0;
        
        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        
        return current;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna