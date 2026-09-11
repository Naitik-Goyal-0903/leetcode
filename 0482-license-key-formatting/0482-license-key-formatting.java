class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        
        // Piche se aage traverse karenge
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch != '-') {
                // Har k characters ke baad dash (-) lagayein
                if (sb.length() % (k + 1) == k) {
                    sb.append('-');
                }
                sb.append(Character.toUpperCase(ch));
            }
        }
        
        // String reverse karke final output return karein
        return sb.reverse().toString();
    }
}