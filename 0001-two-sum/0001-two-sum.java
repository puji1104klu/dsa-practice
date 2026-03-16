class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int n=nums.length;
        HashMap<Integer, Integer> hm= new HashMap<>();
        for(int i=0; i<n; i++)
        {
            hm.put(nums[i],i);
        }
        for(int i=0; i<n; i++)
        {
            int need=target-nums[i];
            if(hm.containsKey(need)&&hm.get(need)!=i)
            {
                return new int[] {i, hm.get(need)};
            }
        }
        return new int[0];
    }
}