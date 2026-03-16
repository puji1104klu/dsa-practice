class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        int n=strs.length;
        HashMap<String, List<String>> hm= new HashMap<>();
        for(String val: strs)
        {
            char a[] =val.toCharArray();
            Arrays.sort(a);
            String key=new String(a);
            if(!hm.containsKey(key))
            {
                hm.put(key,new ArrayList<>());
            }
            hm.get(key).add(val);
        }
        return new ArrayList<>(hm.values());
    }
}