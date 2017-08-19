import java.util.*;


class LevelNodes{
    static LinkedList<Integer>[] graph=null;
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        graph=new LinkedList[N+1];
        int levels[]=new int[N+1];
        levels[1]=1;
        boolean visited[]=new boolean[N+1];
        for(int i=1;i<=N;i++){
            graph[i]=new LinkedList<>();
        }
        for(int i=1;i<N;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }
        int x=sc.nextInt();
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        while(!queue.isEmpty()){
            int node=queue.poll();
            if(levels[node]>x)
            break;
            visited[node]=true;
            for(Integer i:graph[node]){
                if(!visited[i]){
                    levels[i]=levels[node]+1;
                    queue.add(i);
                }
            }
        }
        int count=0;
        for (int i = 1; i<=N; i++) {
            if (levels[i] == x) {
                count++;
            }
        }
        System.out.println(count);
        
    }
}
