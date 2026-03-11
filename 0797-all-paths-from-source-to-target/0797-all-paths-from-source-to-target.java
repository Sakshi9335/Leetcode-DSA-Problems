class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
         List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        
        path.add(0);
        dfs(graph,0,path,ans);
        
        return ans;

    }
    public void dfs(int[][] graph, int curr, List<Integer> path, List<List<Integer>> ans)
    {
       int target = graph.length - 1;
        
        if(curr == target){
            ans.add(new ArrayList<>(path));
            return;
        }
        
        for(int i=0;i<graph[curr].length;i++){
            
            int neigh = graph[curr][i];
            
            path.add(neigh);
            dfs(graph,neigh,path,ans);
            path.remove(path.size()-1);
        }
    }
}