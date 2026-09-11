class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s=s.toUpperCase();
        int index=0;
        StringBuilder sb = new StringBuilder(s.length());
        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='-')
            {
                sb.append(s.charAt(i));
            }
            
        }
        int len = sb.length();
        if (len == 0) return "";
        
        int firstGroup = len % k;
        if (firstGroup == 0) {
            firstGroup = k;
        }
        
        for (int i = firstGroup; i < sb.length(); i += k + 1) {
            sb.insert(i, '-');
        }
        
        return sb.toString();

    }
}