class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s = new Stack<>();
        
        for (char c : num.toCharArray()) {
            while (!s.isEmpty() && k > 0 && s.peek() > c) {
                s.pop();
                k--;
            }
            s.push(c);
        }
        while (k > 0 && !s.isEmpty()) {
            s.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }
        sb.reverse();
        int start = 0;
        while (start < sb.length() && sb.charAt(start) == '0') {
            start++;
        } 
        String result = sb.substring(start);
        return result.length() == 0 ? "0" : result;
    }
}