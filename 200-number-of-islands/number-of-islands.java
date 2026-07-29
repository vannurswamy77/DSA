class Solution {
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int count=0;
        int[][] vis=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(vis[i][j]==0 && grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j,vis);
                }
            }
        }
        return count;
    }
    public void dfs(char[][] grid,int row,int col,int vis[][]){
        int r=grid.length;
        int c=grid[0].length;
        Queue<Node> q=new LinkedList<>();
        q.add(new Node(row,col));
        vis[row][col]=1;
        while(!q.isEmpty()) {
            Node curr = q.remove();
            int ro = curr.row;
            int co = curr.col;
            if(ro - 1 >= 0 && vis[ro - 1][co] == 0 && grid[ro - 1][co] == '1') {
                vis[ro - 1][co] = 1;
                q.add(new Node(ro - 1, co));
            }
            if(ro + 1 < r && vis[ro + 1][co] == 0 && grid[ro + 1][co] == '1') {
                vis[ro + 1][co] = 1;
                q.add(new Node(ro + 1, co));
            }
            if(co - 1 >= 0 && vis[ro][co - 1] == 0 && grid[ro][co - 1] == '1') {
                vis[ro][co - 1] = 1;
                q.add(new Node(ro, co - 1));
            }
            if(co + 1 < c && vis[ro][co + 1] == 0 && grid[ro][co + 1] == '1') {
                vis[ro][co + 1] = 1;
                q.add(new Node(ro, co + 1));
            }
        }
    }
}
class Node{
    int row;
    int col;
    Node(int row,int col){
        this.row=row;
        this.col=col;
    }
}