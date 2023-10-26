class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       char[] j=jewels.toCharArray();
		int count=0;
		for(int i=0;i<j.length;i++) {
			for(int k=0;k<stones.length();k++) {
				if(j[i]== stones.charAt(k)) {
					count++;
				}
			}
		}
	  return count;
		}
}
