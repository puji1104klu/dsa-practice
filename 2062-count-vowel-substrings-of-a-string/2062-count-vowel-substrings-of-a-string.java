class Solution {
    public int countVowelSubstrings(String word) 
    {
        int count=0;

        for(int i=0; i<word.length(); i++)
        {
            HashSet<Character> h= new HashSet<>();
            for(int j=i; j<word.length(); j++)
            {
                char ch= word.charAt(j);
                if(!isvowel(ch))
                break;
                h.add(ch);
                if(h.size()==5)
                count++;
            }
        }
        return count;
        
    }


    public static boolean isvowel(char ch)
    {
        if(ch=='a' ||ch=='e' || ch=='i' || ch=='o' || ch=='u')
        return true;
        return false;
    }
}