// https://leetcode.com/problems/number-of-islands/

class Solution {
    
   
    
    public void DFS(char [][]grid, int i,int j,boolean[][] visited){
    
        int row=grid.length;
        int col=grid[0].length;
         int rowNum[] = new int[] {0,-1,0,1}; 
        int colNum[] = new int[] {-1,0,1,0}; 
  
        visited[i][j]=true;
        for(int k=0;k<4;++k){
            if((i+rowNum[k])>=0 && (i+rowNum[k])<row && (j+colNum[k])>=0 && (j+colNum[k])<col && grid[i+rowNum[k]][j+colNum[k]]=='1' && !visited[i+rowNum[k]][j+colNum[k]]){
                DFS(grid,i+rowNum[k],j+colNum[k],visited);}
        }
    }
    
    public int numIslands(char[][] grid) {
        if(grid.length==0) return 0;
        int res=0;
        int row=grid.length;
        int col=grid[0].length;
        boolean [][] visited=new boolean[row][col];
        for(int i=0;i<row;++i){
            for(int j=0;j<col;++j){
                if(grid[i][j]=='1' && !visited[i][j])
                {
                    DFS(grid,i,j,visited);
                    ++res;  
                    System.out.println(res);
                }
            }
        }
        return res;
    }
}
