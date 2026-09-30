class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        String vowels = "aeiouAEIOU";

        while (i < j) {
            // Move left pointer until a vowel is found
            while (i < j && vowels.indexOf(arr[i]) == -1) {
                i++;
            }
            // Move right pointer until a vowel is found
            while (i < j && vowels.indexOf(arr[j]) == -1) {
                j--;
            }

            // Swap the vowels
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return new String(arr);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna