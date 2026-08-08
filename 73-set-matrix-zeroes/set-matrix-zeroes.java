class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    q.add(new Pair(i,j));
                }
            }
        }
        set(matrix,q);
    }
    public void set(int[][]matrix,Queue<Pair> q){
        while(!q.isEmpty()){
            Pair curr=q.remove();
            int r=curr.row;
            int c=curr.col;
            for(int i=0;i<matrix[0].length;i++){
             matrix[r][i]=0;
            }
           for(int i=0;i<matrix.length;i++){
             matrix[i][c]=0;
            }
        }
    }

}
class Pair{
    int row;
    int col;
    Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}