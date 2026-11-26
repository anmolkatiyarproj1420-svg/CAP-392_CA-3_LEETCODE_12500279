class Solution {
    public void setZeroes(int[][] mat) {
        int [] row = new int [mat.length]; 
        int [] col = new int [mat[0].length]; 
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==0)
                {
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<row.length;i++)
        {
            if(row[i]==1)
            {
                for(int j=0;j<mat[0].length;j++)
                {
                    mat[i][j]=0;
                }
            }
        }

         for(int i=0;i<col.length;i++)
        {
            if(col[i]==1)
            {
                for(int j=0;j<mat.length;j++)
                {
                    mat[j][i]=0;
                }
            }
        }
        return ;
    }
}