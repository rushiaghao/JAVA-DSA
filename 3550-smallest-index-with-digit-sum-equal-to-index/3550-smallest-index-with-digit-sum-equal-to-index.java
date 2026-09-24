class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int digitSum = 0;
            int number = nums[i];
            while(number > 0){
                digitSum += number % 10;
                number /= 10;
            }
            if(i == digitSum){
                return i;
            }
        }
        return -1;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna