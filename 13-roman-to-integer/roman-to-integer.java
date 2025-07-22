import java.util.HashMap;
class Solution {
    public int romanToInt(String sm) {
        HashMap<Character, Integer> s = new HashMap<>();
        s.put('I', 1);
        s.put('V', 5);
        s.put('X', 10);
        s.put('L', 50);
        s.put('C', 100);
        s.put('D', 500);
        s.put('M', 1000);
        int res = s.get(sm.charAt(sm.length() - 1));
        for (int i = sm.length() - 2; i >= 0; i--) {
            if (s.get(sm.charAt(i)) < s.get(sm.charAt(i + 1))) {
                res -= s.get(sm.charAt(i));
            } else {
                res += s.get(sm.charAt(i));
            }
        }
        return res;
    }
}
