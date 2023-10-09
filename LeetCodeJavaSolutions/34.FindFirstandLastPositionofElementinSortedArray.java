class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        int n=nums.length-1;
        for(int i=0,j=n ; i<=n ; j--,i++){
            if(target==nums[i] &&res[0]==-1)
                res[0]=i;            
            if( target==nums[j] &&res[1]==-1)
                res[1]=j;
        }
        return res;
    }
}
