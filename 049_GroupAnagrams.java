import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> tmpMap = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] charKey = strs[i].toCharArray();
            Arrays.sort(charKey);
            String key=new String(charKey);
            if(tmpMap.containsKey(key)){
                tmpMap.get(key).add(strs[i]);
            }else{
                ArrayList<String> tmpArrayList = new ArrayList<>();
                tmpArrayList.add(strs[i]);
                tmpMap.put(key,tmpArrayList);
            }
        }
        return new ArrayList<List<String>>(tmpMap.values());
    }
}