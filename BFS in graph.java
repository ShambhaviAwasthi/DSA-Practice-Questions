// Completed implementation of BFS and Graph with adjacency list;

import java.io.*;
import java.util.*;


class Graph{
        
        private int V; // number of vertices in the graph
        private LinkedList<Integer> adj[];  // adjacency list;
        
        // constructor for the graph
        
        Graph(int v){
                V=v;
                for(int i=0;i<V;i++)
                        adj[i]=new LinkedList(); // create LinkedList for each vertice;    
        }
        
        // this function adds the edges to adjacency list
        puclic void addEdge(int startingNode, int endingNode){
                adj[startingNode].add(endingNode);
        }
        
        public void BFS(int s){
                boolean visited[]=boolean int[V];  // visited array to keep track of all visted nodes
                Queue<Integer> q=new LinkedList<Integer>();
                q.add(s); // add the root vertex to the queue
                visited[s]=true; // make that root is visited
                while(!q.isEmpty()){
                        s=q.poll(); // take out the vertex from the queue
                        System.out.println(s+" "); // print the polled vertex
                        
                        // add all adjacent vertices to the queue
                        
                        Iterator<Integer> i=adj[s].listIterator();
                        while(i.hasNext()){
                                int n=i.next(); // take next ajacent vertex of the current root vertex
                                if(!visited[n]) // if this vertex is not visited yet
                                {
                                        visited[n]=true;
                                        q.add(n);
                                }  
                        }   
                }
        }
        
        public static void main(String args[]){
                Graph g=new Graph(4);
                g.addEdge(0, 1);
                g.addEdge(0, 2);
                g.addEdge(1, 2);
                g.addEdge(2, 0);
                g.addEdge(2, 3);
                g.addEdge(3, 3);
                int startingVertice=2; // can take any vertice as starting vertice
                g.BFS(startingVertice);
        }
        
        
        
}
