class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean[]vis =new boolean[numCourses];
        boolean[]rec=new boolean[numCourses];

        for(int i=0;i<numCourses;i++){
            if(!vis[i]){
              if(iscycle(i,vis,rec,prerequisites)){
                return false;
              }
            }
        }
        return true;
    }
    public boolean iscycle(int curr, boolean[]vis, boolean[]rec,int[][] prerequisites){
        vis[curr]=true;
        rec[curr]=true;
        for(int i=0;i<prerequisites.length;i++){
            int v=prerequisites[i][0];
            int u=prerequisites[i][1];

            if(u==curr){
                if(!vis[v]){
                   if(iscycle(v,vis,rec,prerequisites)){
                    return true;
                   }
                }
                else if(rec[v]){
                    return true;
                }
               
            }
        }
        rec[curr]=false;
        return false;
    }
}