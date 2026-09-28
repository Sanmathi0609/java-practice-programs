class Solution {
    public int[] buildArray(int[] nums) {
        int b[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            b[i]=nums[nums[i]];
        }
       return b; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna