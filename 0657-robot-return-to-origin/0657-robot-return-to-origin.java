class Solution {
    public boolean judgeCircle(String moves) {
        Boolean flag = false;
        int Ucount =0;
        int Lcount =0;
        for (int i =0;i<moves.length();i++)
        {
            if (moves.charAt(i)=='U')
            {
                Ucount++;
            }
            if (moves.charAt(i)=='R')
            {
                    Lcount--;
            }
            if (moves.charAt(i)=='D')
            {
                Ucount--;
            }
            if (moves.charAt(i)=='L')
            {
                Lcount++;
            }
        }
        if(Ucount==0 && Lcount==0)
            {
                flag = true;
            }
        return flag;
    }
}