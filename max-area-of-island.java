// https://leetcode.com/problems/max-area-of-island/


class Solution {
    
    public int dfs(int[][] grid,int i,int j,boolean[][] visited,int ans){
        visited[i][j]=true;
        
        int R=grid.length;
        int C=grid[0].length;
        int row[] = new int[] {0,-1,0,1}; 
        int col[] = new int[] {-1,0,1,0}; 
        ans++;
        for(int k=0;k<4;k++){
            if(i+row[k]>=0 && i+row[k]<R && j+col[k]>=0 && j+col[k]<C && grid[i+row[k]][j+col[k]]==1 && !visited[i+row[k]][j+col[k]])
            {
                
                ans=Math.max(dfs(grid,i+row[k],j+col[k],visited,ans),ans);
            }
        }
        return ans;
        
    }
    
    
    public int maxAreaOfIsland(int[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        int ans=0;
        boolean [][]visited=new boolean[R][C];
        
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    ans = Math.max(dfs(grid, i, j,visited,0), ans);
                }
            }
        }
        return ans;
    }
}
