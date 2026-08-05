class Solution {
    public void solve(char[][] board) {
        int r=board.length;
        int c=board[0].length;
        boolean[][] visted=new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0 || i==r-1 || j==0 || j==c-1){
                    if(board[i][j]=='O' && !visted[i][j]) dfs(board,visted,i,j);
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]=='O' && !visted[i][j]){
                    board[i][j]='X';
                }
            }
        }
    }
    public void dfs(char[][] board,boolean[][] visted,int row,int col){
        visted[row][col]=true;
        int[] delr={-1,1,0,0};
        int[] delc={0,0,-1,1};
        for(int i=0;i<4;i++){
            int nrow=row+delr[i];
            int ncol=col+delc[i];
            if(nrow>=0 && nrow<board.length && ncol>=0 &&ncol<board[0].length){
                if(!visted[nrow][ncol] && board[nrow][ncol]=='O'){
                    dfs(board,visted,nrow,ncol);
                }
            }
        }
    }
}