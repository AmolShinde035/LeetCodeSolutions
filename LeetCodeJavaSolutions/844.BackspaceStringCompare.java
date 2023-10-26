public class Solution {
    public boolean backspaceCompare(String S, String T) {
			  return processString(S).equals(processString(T));
    }

    private List<Character> processString(String str) {
        List<Character> stack = new ArrayList<>();
        for (char c : str.toCharArray()) {
            if (c != '#') {
                stack.add(c);
            } else if (!stack.isEmpty()) {
                stack.remove(stack.size() - 1);
            }
        }
        return stack;
		}
}

//or
// public boolean backspaceCompare(String S, String T) {
     //     char[] sChars = S.toCharArray();
    //     char[] tChars = T.toCharArray();
        
    //     int k = processString(sChars);
    //     int p = processString(tChars);

    //     if (k != p) 
		// 		return false;

    //     for (int i = 0; i < k; i++) {
    //         if (sChars[i] != tChars[i]) return false;
    //     }

    //     return true;
    // }

    // private int processString(char[] chars) {
    //     int k = 0;
    //     for (char c : chars) {
    //         if (c != '#') {
    //             chars[k++] = c;
    //         } else if (k > 0) {
    //             k--;
    //         }
    //     }
    //     return k;
    // }
