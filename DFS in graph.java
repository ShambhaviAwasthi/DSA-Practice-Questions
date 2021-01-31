import java.io.*;
import java.util.*;

class Graph{
   
   private int V;
   private LinkedList<Integer> [] adj;
   
   Graph(int v){
      int v=V;
      adj=new LinkedList[v];
      for(int i=0;i<v;i++){
         adj[i]=new LinkedList<Integer>();
      }
   }
   
   public void addEdge(int startingVertex, int endingVertex){
      adj[startingVertex].add(endingVertex);
   }
   
   public void DFS(int s){
      boolean visited[]=new boolean[V];
      Stack<Integer> st=new Stack<>();
      st.push(s);
      visited[s]=true;
      while(!st.isEmpty()){
         s=st.peek();
         st.pop();
         
         // if popped element is not visited then print it
         if(visited[s]==false){
            System.out.print(s+" ");
            visited[s]=true;
         }
         Iterator<Integer> i=adj[s].iterator();
         while(i.hasNext()){
            int p=i.next();
            if(visited[p]==false)
               st.push(p);
         }
      }
   }
   
   public static void main(String[] args) 
    {
       
        Graph g = new Graph(5);
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 4);
        g.DFS(0);
    }
   
}
