class Solution {
    public boolean detectCapitalUse(String word) {
        int upper=0;
        int count=0;
     for(int i=0;i<word.length();i++){
        if(Character.isUpperCase(word.charAt(i))){
            upper++;
        }
     }   
     if(upper==0){
        return true;
     }
     if(upper==word.length()){
        return true;
     }
     if(upper==1 && Character.isUpperCase(word.charAt(0))){
        return true;
     }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna