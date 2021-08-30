package 春招.hua;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static int ans = 0;
    static int [] reverseEdges;
    static boolean[] visited;

    public static int leastTime(int n, int[][] edges, List<Boolean> hasApple){
        reverseEdges = new int[n];

        for(int [] edge: edges){
            reverseEdges[edge[1]] = edge[0];
        }

        visited = new boolean[n];
        visited[0] = true;

        for(int i = 0;i<n;i++){
            if(hasApple.get(i)){
                dfs(i);
            }
        }
        return ans * 2;

    }

    private static void dfs(int to) {
        if(!visited[to]){
            visited[to] = true;
            ans++;
            dfs(reverseEdges[to]);
        }
    }

    public static void main(String[] args) {
        int n = 7;
        int[][] edges = {{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}};
        boolean[] has = {false,false,true,false,true,true,false};
        List<Boolean> hasApple = new ArrayList<>();
        for(Boolean hasApp : has){
            hasApple.add(hasApp);
        }
        System.out.println(leastTime(n,edges,hasApple));
    }
}
