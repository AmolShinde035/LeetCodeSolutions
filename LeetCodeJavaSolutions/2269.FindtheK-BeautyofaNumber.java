class Solution {
    public int divisorSubstrings(int num, int k) {
        StringBuilder s = new StringBuilder("");
        s.append(num);
        int n = s.length();
        int ans = 0;
        for(int i=0; i<=n-k; i++){           
            int x = Integer.parseInt(s.substring(i, i+k));
            if(x!=0 && num%x==0) 
                ans++;
        }
        return ans;
    }
}
