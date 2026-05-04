class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> hm.get(a)-hm.get(b));

        for(int n: hm.keySet())
        {
            pq.add(n);

            if(pq.size()>k)
            {
                pq.poll();
            }
        }

        int res[] = new int[k];
        int i=0;
        while(!pq.isEmpty())
        res[i++]=pq.poll();
        return res;
    }
}