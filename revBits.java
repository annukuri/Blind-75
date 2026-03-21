class Solution {
    public int reverseBits(int n) 
    {
        int Rnum = 0, msb;
        for(int i = 0; i < 32; i++)
        {
            msb = n & 1;        
            Rnum = Rnum << 1;
            Rnum = Rnum | msb;
            n = n >> 1;
        }
        return Rnum;
    }
}