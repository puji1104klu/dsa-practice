class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        int n=strs.length;
        HashMap<String, List<String>> hm= new HashMap<>();
        for(String s: strs)
        {
            int count[]= new int[26];
            for(char ch:s.toCharArray())
            {
                count[ch-'a']++;
            }
                String k= Arrays.toString(count);
                hm.putIfAbsent(k,new ArrayList<>());
                hm.get(k).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}