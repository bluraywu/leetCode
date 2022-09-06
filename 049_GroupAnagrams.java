import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsGroups = new HashMap<>();
        for (String str : strs) {
            char[] charStr = str.toCharArray();
            Arrays.sort(charStr);
            String anagramKey = String.valueOf(charStr);
            anagramsGroups.putIfAbsent(anagramKey,new ArrayList<>());
            anagramsGroups.get(anagramKey).add(str);
//            if (anagramsGroups.containsKey(anagramKey)) {
//                anagramsGroups.get(anagramKey).add(str);
//            }else{
//                anagramsGroups.put(anagramKey, new ArrayList<>(){{add(str);}});
//            }
        }
        return new ArrayList<>(anagramsGroups.values());
    }
}