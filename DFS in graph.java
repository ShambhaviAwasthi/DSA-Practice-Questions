class Traversal
{
   
    static ArrayList<Integer> recur(ArrayList<Integer> al,ArrayList<ArrayList<Integer>> g, int N,int []visited,int start){
       if(visited[start]==0){
           al.add(start);
           visited[start]=1;
       }
       for(int j=0;j<g.get(start).size();j++){
           if(visited[g.get(start).get(j)]==0){
               recur(al,g,N,visited,g.get(start).get(j));
           }
       }
       return al; 
    }
    static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> g, int N)
    {
       // add your code here
       int visited[]=new int[N];
       ArrayList<Integer> al=new ArrayList<Integer>();
  int start=0;
  return recur(al,g,N,visited,start);
       
    }
}
