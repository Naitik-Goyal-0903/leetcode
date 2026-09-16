class Solution {
    public boolean judgeCircle(String moves) {
        Boolean flag = false;
        int Ucount =0;
        int Lcount =0;int Dcount =0;int Rcount =0;
        for (int i =0;i<moves.length();i++)
        {
            if (moves.charAt(i)=='U')
            {
                Ucount++;
            }
            if (moves.charAt(i)=='R')
            {
                Rcount++;
            }
            if (moves.charAt(i)=='D')
            {
                Dcount++;
            }
            if (moves.charAt(i)=='L')
            {
                Lcount++;
            }
        }
        if(Ucount==Dcount && Rcount==Lcount)
            {
                flag = true;
            }
        return flag;
    }
}