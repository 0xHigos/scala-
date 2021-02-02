public class Test2 {
}
class Solution {
    public int characterReplacement(String s, int k) {
        int[] fred = new int[26];
        int right = 0,left = 0,maxCount = 0;
        char[] chars = s.toCharArray();
        while(right < chars.length){
            maxCount = Math.max(maxCount,fred[chars[right] -'A']++);
            if(right - left > maxCount + k){
                fred[chars[right] -'A']--;
                left ++;
            }
        }
        return right - left;
    }
}
