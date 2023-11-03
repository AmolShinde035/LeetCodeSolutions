class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int i=0,j=s.length()-1;//starr index, last index
        while(i<=j){
            char f=s.charAt(i);//first
            char l=s.charAt(j);//last

            if(!Character.isLetterOrDigit(f)){
                i++;
            }else if(!Character.isLetterOrDigit(l)){
                j--;
            
            }else{
                if(Character.toLowerCase(f)!=Character.toLowerCase(l))
                {
                    return false;
                }
                i++;j--;
            }
        }
        return true;

// or

        // s=s.toLowerCase();
        // String[] arr;
        // arr=s.split("[^A-Za-z0-9]+");
        // String s1=String.join("",arr);
        // String palindrome=new StringBuilder(s1).reverse().toString();
        // return s1.equals(palindrome);
    }
}
