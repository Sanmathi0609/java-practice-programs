class Solution {
    public int[] leftRightDifference(int[] nums) {
        int []b=new int[nums.length];
        for(int i=0;i<b.length;i++){
            int l=0,r=0;
            for(int j=0;j<i;j++){
                l+=nums[j];
            }
            for(int j=i+1;j<nums.length;j++){
                r+=nums[j];
            }
            int ab=Math.abs(l-r);
            b[i]=ab;

        }
        return b;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna