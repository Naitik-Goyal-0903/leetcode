class Solution {
    public boolean judgeCircle(String moves) {
        Boolean flag = false;
        int Ucount =0;
        int Lcount =0;
        for (char move : moves.toCharArray())
        {
            if (move=='U')
            {
                Ucount++;
            }
            if (move=='R')
            {
                    Lcount--;
            }
            if (move=='D')
            {
                Ucount--;
            }
            if (move=='L')
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