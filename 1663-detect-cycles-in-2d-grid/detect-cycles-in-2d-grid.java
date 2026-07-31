class Solution {
    public boolean containsCycle(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        boolean visted[][] =new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(!visted[i][j]){
                    if(dfs(visted,grid,i,j,-1,-1)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean dfs(boolean visted[][],char[][] grid,int r,int c,int pr,int pc){
        visted[r][c]=true;
        int delr[]={-1,1,0,0};
        int delc[]={0,0,-1,1};
        for(int i=0;i<4;i++){
            int nrow=r+delr[i];
            int ncol=c+delc[i];
            if(nrow<0 || nrow>=grid.length || ncol<0 || ncol>=grid[0].length){
                continue;
            }
            if(grid[nrow][ncol]!=grid[r][c]){
                continue;
            }
            if(nrow==pr && ncol==pc){
                continue;
            }
            if(visted[nrow][ncol]){
                return true;
            }
            if(dfs(visted,grid,nrow,ncol,r,c)){
                return true;
            }
        }
        return false;
    }
}