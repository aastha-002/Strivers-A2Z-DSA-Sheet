// Leetcode-9 Palindrome Number

class Solution {
    public boolean isPalindrome(int x) {
        int result=0;
        int i=x;
        if (x<0){
            return false;
        }
        while(x>0){
            int rem=x%10;
            x=x/10;
            result=result*10 +rem;
        }
        if(i==result){
            return true;
        }
        else{
            return false;
        }
    }
}
