import java.util.HashSet;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashSet<String> mapST = new HashSet<>();
        HashSet<Character> setS = new HashSet<>();
        HashSet<Character> setT = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Pair format create karte hain, e.g., "b->a"
            mapST.add(charS + "->" + charT);
            setS.add(charS);
            setT.add(charT);
        }
        return mapST.size() == setS.size() && mapST.size() == setT.size();
    }
}