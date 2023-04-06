package GraphTraversal.BFS;

import java.util.*;

public class BfsIntegers {

    public static void main(String[] args) {
        int V = 9;
        boolean visited[] = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();

        ArrayList<Integer> zero = new ArrayList<>() {{add(1);add(5);}};
        ArrayList<Integer> one = new ArrayList<>() {{add(0);add(2);add(3);}};
        ArrayList<Integer> two = new ArrayList<>() {{add(1);}};
        ArrayList<Integer> three = new ArrayList<>() {{add(1);add(4);}};
        ArrayList<Integer> four = new ArrayList<>() {{add(3);add(7);}};
        ArrayList<Integer> five = new ArrayList<>() {{add(0);add(6);add(8);}};
        ArrayList<Integer> six = new ArrayList<>() {{add(5);add(7);}};
        ArrayList<Integer> seven = new ArrayList<>() {{add(4);add(6);}};
        ArrayList<Integer> eight = new ArrayList<>() {{add(5);}};

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(zero);adj.add(one);adj.add(two);adj.add(three);adj.add(four);adj.add(five);adj.add(six);adj.add(seven);adj.add(eight);
        bfs(V, adj, ans, visited);
    }

    private static void bfs(int v, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans, boolean[] visited) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(0);
        visited[0]=true;
        while(!queue.isEmpty()){
            ans.add(queue.peek());
            int k=queue.poll();
            for(int ele:adj.get(k)){
                if(!visited[ele]){
                    queue.add(ele);
                    visited[ele]=true;
                }
            }
        }
        System.out.println(ans);
    }

}
