class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }

        //create a list and keep these hashmap values
        List<Integer> l= new ArrayList<>(hm.keySet());
        l.sort((a,b)->hm.get(b)-hm.get(a));
        
        int res[] = new int[k];
        for(int i=0; i<k; i++)
        {
            res[i]=l.get(i);
        }
        return res;
    }
}