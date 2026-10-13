import java.util.ArrayList;
import java.io.*;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                result.add(i);
            }
        }
        
        return result;
    }
    
    private boolean isSelfDividing(int num) {
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            // A self-dividing number cannot contain 0, and num must be divisible by every digit
            if (digit == 0 || num % digit != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna