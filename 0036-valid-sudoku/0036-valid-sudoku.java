class Solution {
    public boolean isValidSudoku(char[][] a) 
    {

        for(int r=0; r<9; r++)
        {
            HashSet<Integer> hm= new HashSet<>();
            for(int c=0; c<9; c++)
            {
                int val=a[r][c];
                if(val=='.')
                continue;
                if(hm.contains(val))
                {
                    return false;
                }
                hm.add(val);
            }
        }

        for(int c=0; c<9; c++)
        {
            HashSet<Integer> hm= new HashSet<>();
            for(int r=0; r<9; r++)
            {
                int val=a[r][c];
                if(val=='.')
                continue;
                if(hm.contains(val))
                {
                    return false;
                }
                hm.add(val);
            }
        }


        for(int b=0; b<9; b++)
        {
            HashSet<Integer> hm= new HashSet<>();
            int s=(b/3)*3;
            int e=(b%3)*3;
            for(int i=0; i<3; i++)
            {
                for(int j=0; j<3; j++)
                {
                    int val=a[s+i][e+j];
                    if(val=='.')
                    continue;
                    if(hm.contains(val))
                    return false;
                    hm.add(val);
                }
            }
        }

        return true;
    }
}