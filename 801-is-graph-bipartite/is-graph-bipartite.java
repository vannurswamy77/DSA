class Solution {
    public boolean isBipartite(int[][] graph) {
      boolean[] visted=new boolean[graph.length];
      int[] color=new int[graph.length];
      Queue<Integer> q=new LinkedList<>();
      for (int i = 0; i < graph.length; i++) {
            if (!visted[i]) {
                q.add(i);
                visted[i] = true;
                if (!bfs(graph, visted, color, q)) {
                    return false;
                }
            }
        }
      return true;

    }
    public boolean bfs(int[][] graph,boolean[] visted,int[] color,Queue<Integer> q){
        while(!q.isEmpty()){
            int curr=q.remove();
            for(int i=0;i<graph[curr].length;i++){
                int neigh=graph[curr][i];
                if(!visted[neigh]){
                    q.add(neigh);
                    visted[neigh]=true;
                    color[neigh]=1-color[curr];
                }
                else if (color[neigh]==color[curr]){
                    return false;
                }
            }
        }
        return true;
    }
}