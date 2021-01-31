import java.util.*;
import java.io.*;

class Graph{
int V;
LinkedList<Integer>[] adj;

Graph(int v){
int V=v;
for(int i=0;i<V;i++)
adj[i]=new LinkedList<Integer>();
}

public void addEdge(int start, int dest){
adj[start].add(dest);
}

public boolean isCyclic(){
boolean []visited=new int[V];
boolean [] recStack=new int[V];

for(int i=0;i<V;i++){
if(isCyclicUtil(i,visited,recStack)
return true;
}
return false;
}

public boolean isCyclicUtil(int i, int[] visited, int[] recStack){
if(visited[i])
return false;
if(recStack[i])
return true;

visited[i]=true;
recStack[i]=true;

Iterator<Integer> i=adj[i].listIterator();
while(i.hasNext()){
int n=i.next();
if(isCyclicUtil(n,visited,recStack)
return true;
}

recStack[i]=false;
return false;

}



public static void main(String args[]){
Graph g=new Graph(4);
graph.addEdge(0, 1); 
        graph.addEdge(0, 2); 
        graph.addEdge(1, 2); 
        graph.addEdge(2, 0); 
        graph.addEdge(2, 3); 
        graph.addEdge(3, 3); 
          
        if(graph.isCyclic()) 
            System.out.println("Graph contains cycle"); 
        else
            System.out.println("Graph doesn't "
                                    + "contain cycle"); 
}
}
