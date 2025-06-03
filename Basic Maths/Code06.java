// GFG - All divisors of a Number 

class Solution {
    public static void print_divisors(int n) {
        int i=1;
        while(i<=n){
            if(n%i==0){
                System.out.print(i + " ");
            }
            i++;
        }
        
    }
}
