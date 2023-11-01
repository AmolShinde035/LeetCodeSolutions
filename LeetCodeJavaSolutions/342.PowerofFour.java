class Solution {
    public boolean isPowerOfFour(int n) {
        boolean f=false;
        if(n%4==0 ||n==1)  {
            for(int i=0;i<=Math.sqrt(n);i++){
            int power=(int)Math.pow(4,i);
            if(n==power){
                f=true;
                break;
            }
            }
        }
        else 
            return false;
        
        return f;
    }
}
