class Solution {
    public int maxFrequencyElements(int[] nums) 
    {
        int ans=0;
        HashMap<Integer, Integer> hm= new HashMap<>();
        for(int n: nums)
        {
            hm.put(n, hm.getOrDefault(n,0)+1);
        }
        int maxfreq=0;
        for(int n:hm.values())
        {
            if(n>maxfreq)
            maxfreq=n;
        }
        for(int n:hm.values())
        {
            if(n==maxfreq)
            ans+=maxfreq;
        }
        return ans;
    }
}