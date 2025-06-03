// GFG - Prime Number

class Solution {
    static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c=c+1;
        }
        return true;
    }
}
