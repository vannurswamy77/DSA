class Solution {
    public int numIslands(char[][] grid) {
        int r=grid.length,c=grid[0].length;
        int visted[][]=new int[r][c];
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1' && visted[i][j]==0){
                    dfs(grid,visted,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(char[][] grid,int[][] visted,int r,int c){
        visted[r][c]=1;
        int[] delr={-1,1,0,0};
        int[] delc={0,0,-1,1};
        for(int i=0;i<4;i++){
            int nrow=r+delr[i];
            int ncol=c+delc[i];
            if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length){
                if(grid[nrow][ncol]=='1' && visted[nrow][ncol]==0){
                    dfs(grid,visted,nrow,ncol);
                }
            }
        }
    }
}