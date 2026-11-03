class Solution {
    public int arrangeCoins(int n) {
        long left = 1, right = n;
        long ans = 0;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long coinsNeeded = mid * (mid + 1) / 2;
            
            if (coinsNeeded <= n) {
                ans = mid;          // This row is possible, try for a larger one
                left = mid + 1;
            } else {
                right = mid - 1;    // Too many coins needed, try fewer rows
            }
        }
        
        return (int) ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna