class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int sum=0;
        int count =1;
        int a[]= new int[2];
        for (int i =0;i<s.length();i++)
        {
            char c = s.charAt(i);
            int asci = (int)c -97;
            int remain=widths[asci];
            if(sum+remain > 100)
            {
                count++;
                sum=remain;
            }
            else
            {
                sum=sum+remain;
            }
        }
        a[0]=count;
        a[1]=sum;
        return a;
    }
}