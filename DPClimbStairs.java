class DPClimbStairs {
    public int climbStairs(int n) 
    {
        if(n==1) return 1;
        if(n==2) return 2;
        int nsub1 = 2, nsub2 = 1;
        int curr = 0;
        for(int i =3; i<=n; i++)
        {
            curr = nsub1 + nsub2;
            nsub2 = nsub1;
            nsub1 = curr;
        }
        return curr;
    }
}