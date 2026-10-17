class Solution {
    public int passThePillow(int n, int time) {
        // Each full cycle (forward and backward) takes (n - 1) * 2 seconds
        int cycle = 2 * (n - 1);
        int rem = time % cycle;
        
        // If the remaining time is within the forward trip
        if (rem < n) {
            return 1 + rem;
        } else {
            // Otherwise, it's on the return trip
            return n - (rem - (n - 1));
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna