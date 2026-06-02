class Solution {
    char[][] board;
     String word;
     int n,m;
    public boolean exist(char[][] board, String word) 
    { 
        this.board=board;
        this.word=word;
         n= board.length;
         m= board[0].length;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                boolean[][] vis=new boolean [n][m];
                if(board[i][j]==word.charAt(0))
                {
                    if(recurse(i,j,0,vis))
                    return true;
                }
            }
        }
        return false;
    }

    public boolean recurse(int i, int j, int idx, boolean[][] vis)
    {
        if(idx==word.length())
        return true;

        if(i<0 || i>=n || j<0 || j>=m || vis[i][j]|| board[i][j]!=word.charAt(idx))
        return false;
        vis[i][j]=true;
        boolean pos=recurse(i-1, j, idx+1, vis) || recurse(i+1, j, idx+1, vis) || recurse(i, j+1 , idx+1, vis) || recurse(i, j-1, idx+1, vis);
        vis[i][j]=false;
        return pos;
    }
}