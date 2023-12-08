class Solution {
    public int waysToSplitArray(int[] nums) {
        long right=0;
        //Get total sum
        for(int i=0;i<nums.length;i++){
            right+=nums[i];
        }
        //get left sum at same time subtract left from right and go for comparision 
        long left=0;
        int valid=0;
        for(int i=0;i<nums.length-1;i++){
            left+=nums[i];
            right-=nums[i];
          
            if(left>=right){
                valid++;
            }
        }
    return valid;
    }
}
