class Solution {
    public char kthCharacter(int k) {
        if (k == 1) {
            return 'a';
        }
        
        // Find the largest power of 2 less than k
        int length = 1;
        while (length < k) {
            length *= 2;
        }
        
        // The midpoint splits the previous state and the newly generated state
        int mid = length / 2;
        
        // If k is in the second half, it's the corresponding character from the first half + 1
        if (k > mid) {
            char prevChar = kthCharacter(k - mid);
            return (prevChar == 'z') ? 'a' : (char)(prevChar + 1);
        } else {
            // Otherwise, it's just the character from the first half
            return kthCharacter(k);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna