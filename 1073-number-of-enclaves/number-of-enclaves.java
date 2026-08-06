class Solution {
    public int numEnclaves(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int count=0,vis_count=0;
        boolean[][] visted=new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    count++;
                }
                if(i==0 || i==r-1 ||j==0 || j==c-1){
                    if(!visted[i][j]&& grid[i][j]==1){
                        dfs(grid,visted,i,j);
                    }  

                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(visted[i][j] && grid[i][j]==1){
                    vis_count++;
                }
            }
        }
        return count-vis_count;
    }
    public void dfs(int[][] grid,boolean[][] visted,int row,int col){
        int delr[]={-1,1,0,0};
        int delc[]={0,0,-1,1};
        visted[row][col]=true;
        for(int i=0;i<4;i++){
            int nrow=row+delr[i];
            int ncol=col+delc[i];
            if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length){
                if(!visted[nrow][ncol] && grid[nrow][ncol]==1){
                    dfs(grid,visted,nrow,ncol);
                }
            }
        }
    }
}