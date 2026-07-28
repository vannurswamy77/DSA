class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i+1).add(j+1);
                    adj.get(j+1).add(i+1);
                }
            }
        }
        boolean vis[]=new boolean[n+1];
        int count=0;
        for(int i=1;i<=n;i++){
            if(!vis[i]){
                count++;
                dfs(i,vis,adj);
            }
        }
        return count;
    }
    public void dfs(int node , boolean vis[], ArrayList<ArrayList<Integer>> adj){
        vis[node]=true;
        for(int neigh:adj.get(node)){
            if(!vis[neigh]){
                dfs(neigh,vis,adj);
            }
        }
    }
}