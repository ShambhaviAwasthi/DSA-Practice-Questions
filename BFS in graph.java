class Traversal {
        // add your code here
    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> g, int N){
                boolean visited[]=new boolean[N];
                Queue<Integer> q=new LinkedList<Integer>();
                ArrayList<Integer> al=new ArrayList<>();
                visited[0]=true;
                q.add(0);
                while(!q.isEmpty())
                {
                int temp=q.poll();
                al.add(temp);
                for(int i: g.get(temp))
                {
                if(!visited[i])
                {
                    visited[i]=true;
                    q.add(i);
                    
                }
                }
                }
                return al;
}
    
}
