class Solution {
    public boolean detectCapitalUse(String word) {
        String lower = word.toLowerCase();
        String upper = word.toUpperCase();
       String a = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
        boolean flag =false;
        if(word.equals(lower)||word.equals(upper)||word.equals(a))
        {
            flag = true;
        }
        return flag;
       
    }
}