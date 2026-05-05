class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int prod=1;
        int[] res= new int[nums.length];
        int zc=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]!=0)
            {
                prod*=nums[i];
            }
            else
            {
                zc++;
            }
        }

        if(zc>1)
        {
            return res;
        }

        for(int i=0; i<nums.length; i++)
        {
            if(zc>0)
            {
                 res[i]=(nums[i]==0)?prod:0;
            }
            else
            {
                 res[i]=prod/nums[i];
            }
        }
        return res;
        
    }
}