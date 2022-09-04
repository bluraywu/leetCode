import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] charS=s.toCharArray();
        char[] charT=t.toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);
        return String.valueOf(charS).equals(String.valueOf(charT));
    }
    public boolean isAnagram2(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }else{
            int[] cnt=new int[26];
            for(char c:s.toCharArray()){
                cnt[c-'a']++;
            }
            for(char c:t.toCharArray()){
                if(cnt[c-'a']==0)
                    return false;
                cnt[c-'a']--;
            }
            return true;
        }
    }
}