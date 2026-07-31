class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int r = grid.length;
        int c = grid[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 2) {
                    q.add(new Pair(i, j));
                }
            }
        }
        int re=Bfs(grid,0,q);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        if(re==0){
            return 0;
        }
        return re-1;
    }
    public int Bfs(int[][] grid,int time,Queue<Pair> q){
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
            Pair curr=q.remove();
            int dr=curr.row;
            int dc=curr.col;
            if(dr-1>=0 && grid[dr-1][dc]==1){
                grid[dr-1][dc]=2;
                q.add(new Pair(dr-1,dc));
            }
            if(dr+1<grid.length && grid[dr+1][dc]==1){
                grid[dr+1][dc]=2;
                q.add(new Pair(dr+1,dc));
            }
            if(dc-1>=0 && grid[dr][dc-1]==1){
                grid[dr][dc-1]=2;
                q.add(new Pair(dr,dc-1));
            }
            if(dc+1<grid[0].length && grid[dr][dc+1]==1){
                grid[dr][dc+1]=2;
                q.add(new Pair(dr,dc+1));
            }
        }
        time++;
    }
       return time; 
    }
}
class Pair {
    int row;
    int col;
    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}