class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
       int a=n*(n+1)/2;
       int c=0;
       for(int b:nums){
        c+=b;
       } 
       return a-c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna