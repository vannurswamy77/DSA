class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> re=new ArrayList<>();
        int n=grid.length;
        int m=grid[0].length;
        int total=n*m;
        k%=total;
        for(int i=0;i<n;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<m;j++){
                row.add(0);
            }
            re.add(row);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int old_index=i*m+j;
                int new_index=(old_index+k)%total;
                int row=new_index/m;
                int col=new_index%m;
                re.get(row).set(col,grid[i][j]);

            }
        }
        return re;
    }
}