class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        //Better solution
        //O(n)
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i]==nums[i-1])
            {
                return true;
            }
        }
        return false;   
    }
}