class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        // //Brute Force
        // //O(n2)
        
        // for(int i=0; i<nums.length; i++)
        // {
        //     for(int j=i+1; j<nums.length; j++)
        //     {
        //         if(nums[i]==nums[j])
        //         {
        //             return true;
        //         }
        //     }
        
        // }
        // return false;


        // //Better solution
        // //O(n)

        // Arrays.sort(nums);
        // for(int i=1; i<nums.length; i++)
        // {
        //     if(nums[i]==nums[i-1])
        //     {
        //         return true;
        //     }
        // }
        // return false;  



        //Optimal - O(n)
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0; i<nums.length; i++)
        {
            if(hs.contains(nums[i]))
            {
                return true;
            }
            hs.add(nums[i]);
        }
        return false;
    }
}