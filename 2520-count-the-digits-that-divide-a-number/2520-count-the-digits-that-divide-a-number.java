class Solution {
    public int countDigits(int num) 
    {
        int or=num;
        int count=0;
        while(num>0)
        {
            int dig=num%10;
            if(or%dig==0)
            {
                count++;
            }
            num=num/10;
        }
        return count;
    }
}