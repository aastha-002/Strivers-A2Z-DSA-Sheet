class Solution {
    public static void print_divisors(int n) {
        // code here
        ArrayList<Integer> divisor=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                divisor.add(i);
                
                int s_divisor=n/i;
                if(i!=s_divisor){
                    divisor.add(s_divisor);
                }
            }
        }
        Collections.sort(divisor);
        for(int j=0;j<divisor.size();j++){
            System.out.print(divisor.get(j)+" ");
        }
    }
}
