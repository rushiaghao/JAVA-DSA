class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        
        for (int i = 0; i < columnTitle.length(); i++) {
            // Get the numeric value of the character (e.g., 'A' -> 1, 'B' -> 2)
            int currentCharValue = columnTitle.charAt(i) - 'A' + 1;
            
            // Shift previous result left in base 26 and add the current value
            result = result * 26 + currentCharValue;
        }
        
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna