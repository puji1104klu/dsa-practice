class Solution {
    public boolean isPalindrome(int x) 
    {
        int n=x;
        int rev=0;
        if(x<0)
        return false;
        while(x!=0)
        {
            int d=x%10;
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10)
            return false;
            rev=rev*10+d;
            x=x/10;
        }
        if(rev==n)
        return true;
        else
        return false;
        
    }
}