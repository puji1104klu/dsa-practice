class Solution {
    public void merge(int[] a, int m, int[] b, int n) 
    {
        int p1=m-1;
        int p2=n-1;
        int p3=n+m-1;

        while(p1>=0 && p2>=0)
        {
            if(a[p1]>b[p2])
            {
                a[p3]=a[p1];
                p3--;
                p1--;
            }
            else
            {
                a[p3]=b[p2];
                p3--;
                p2--;
            }
        }

        while(p1>=0)
        {
            a[p3]=a[p1];
                p3--;
                p1--;
        }
        while(p2>=0)
        {
            a[p3]=b[p2];
                p3--;
                p2--;
        }
    }
}