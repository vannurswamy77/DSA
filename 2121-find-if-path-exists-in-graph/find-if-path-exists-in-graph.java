class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination) return  true;
        Map<Integer,List<Integer>> graph = new HashMap();
        boolean[] visted = new boolean[n];
        for(int i = 0 ; i < n ; i++) graph.put(i, new ArrayList());
        for(int[] edge : edges){
           graph.get(edge[0]).add(edge[1]);
           graph.get(edge[1]).add(edge[0]);
        }
        return dfs(graph,visted,source,destination);
    }
    public boolean dfs(Map<Integer,List<Integer>> graph,boolean[] visted,int s,int d){
        visted[s]=true;
        for(int nei:graph.get(s)){
            if(nei==d){
                return true;
            }
            if(!visted[nei]){
                if(dfs(graph,visted,nei,d)){
                    return true;
                }
            }
        }
        return false;
    }
}