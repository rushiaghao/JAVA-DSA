class Solution {
    public int reverseDegree(String s) {
        int reversedDegree = 0;

        for( int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int reverseIndex = 26 - (c - 'a');
            int stringIndex = i + 1;
            reversedDegree += reverseIndex * stringIndex;
        }
        return reversedDegree;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna