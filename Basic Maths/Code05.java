// GFG - Armstrong Number

class Solution {
    static boolean armstrongNumber(int n) {
        
        int original=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+ rem*rem*rem;
            n=n/10;
        }
        if(sum==original){
            return true;
        }
        else{
            return false;
        }
        
    }
}
