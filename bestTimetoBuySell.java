class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int minSoFar = prices[0], maxP = 0;
        for(int i=0; i< prices.length; i++)
        {
            if(minSoFar>prices[i]) minSoFar = prices[i];
            maxP = Math.max(maxP, prices[i] - minSoFar);
        }
        return maxP;
    }
}