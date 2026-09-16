class Solution {
    public boolean checkRecord(String s) {
        int A_count = 0;
        int temp = 0; // Consecutive 'L' count

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'A') {
                A_count++;
                temp = 0; // 'L' ki sequence toot gayi
            } else if (c == 'L') {
                temp++;
            } else {
                temp = 0; // 'P' aane par bhi 'L' ki sequence toot gayi
            }

            // Agar 2 Absents ya 3 Consecutive Lates ho gaye toh award nahi milega
            if (A_count >= 2 || temp >= 3) {
                return false;
            }
        }

        return true;
    }
}