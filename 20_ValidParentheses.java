import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isValid(String s) {
        if (s.length() <= 1) {
            return false;
        }
        Deque<Character> deque = new ArrayDeque<>();
        Map<Character, Character> t = new HashMap<>();
        t.put('}', '{');
        t.put(')', '(');
        t.put(']', '[');


        for (int i = 0; i < s.length(); i++) {
            Character curr = s.charAt(i);
            //a open
            if (!t.containsKey(curr)) {
                deque.push(s.charAt(i));
            } else {//close
                if (deque.isEmpty() || !deque.pop().equals(t.get(curr))) {
                    return false;
                }
            }
        }
        if (deque.size() > 0) {
            return false;
        }
        return true;
    }
}