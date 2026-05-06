class Solution {
    public int longestConsecutive(int[] nums) 
    {
        HashSet<Integer> hm= new HashSet<>();
        for(int num: nums)
        {
            hm.add(num);
        }

        int longest=0;
        for(int num: hm)
        {
            if(!hm.contains(num-1))
            {
                int length=1;
                while(hm.contains(num+length))
                {
                    length++;
                }
            
            longest= Math.max(length, longest);
            }
        }

        return longest;
    }
}