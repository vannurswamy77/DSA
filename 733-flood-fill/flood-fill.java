class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int r=image.length;
        int c=image[0].length;
        boolean[][] visted=new boolean[r][c];
        int intial_colour=image[sr][sc];
        dfs(image,sr,sc,color,visted,intial_colour);
        return image;
        
    }
    public  void dfs(int[][] image,int sr,int sc,int color,boolean[][] visted,int intial_color){
        visted[sr][sc]=true;
        image[sr][sc]=color;
        if(sr-1>=0 && image[sr-1][sc]==intial_color && visted[sr-1][sc]==false){
            dfs(image,sr-1,sc,color,visted,intial_color);
        }
        if(sr+1<image.length && image[sr+1][sc]==intial_color && visted[sr+1][sc]==false){
            dfs(image,sr+1,sc,color,visted,intial_color);
        }
        if(sc-1>=0 && image[sr][sc-1]==intial_color && visted[sr][sc-1]==false){
            dfs(image,sr,sc-1,color,visted,intial_color);
        }
        if(sc+1<image[0].length && image[sr][sc+1]==intial_color && visted[sr][sc+1]==false){
            dfs(image,sr,sc+1,color,visted,intial_color);
        }
    }

}