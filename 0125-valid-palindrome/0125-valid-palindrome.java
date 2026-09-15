class Solution {
    public boolean isPalindrome(String s) {
        String cleanString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean flag = true;
        int len = cleanString.length();

        for (int i = 0; i < len / 2; i++) {
            if (cleanString.charAt(i) == cleanString.charAt(len - i - 1)) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
