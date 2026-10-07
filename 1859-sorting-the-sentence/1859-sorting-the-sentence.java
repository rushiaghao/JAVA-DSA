class Solution {
    public String sortSentence(String s) {
        // Split the sentence into individual words
        String[] words = s.split(" ");
        String[] result = new String[words.length];

        for (String word : words) {
            // Extract the position from the last character (convert '1'-'9' to 0-indexed integer)
            int index = word.charAt(word.length() - 1) - '1';
            
            // Remove the position digit from the word and place it in the result array
            result[index] = word.substring(0, word.length() - 1);
        }

        // Join the sorted words with spaces
        return String.join(" ", result);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna