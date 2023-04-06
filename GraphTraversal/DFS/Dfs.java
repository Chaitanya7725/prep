package GraphTraversal.DFS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Dfs {

    public static void main(String[] args) {
        int V = 7;
        boolean visited[] = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();

        Map<Character,Integer> records=new HashMap<>();
        records.put('a',0);
        records.put('b',1);
        records.put('c',2);
        records.put('d',3);
        records.put('e',4);
        records.put('f',5);
        records.put('g',6);
        records.put('h',7);

        ArrayList<Integer> zero = new ArrayList<>() {{add(records.get('b'));add(records.get('c'));add(records.get('d'));}};
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>() {{add(records.get('e'));add(records.get('f'));}};
        ArrayList<Integer> three = new ArrayList<>();
        ArrayList<Integer> four = new ArrayList<>();
        ArrayList<Integer> five = new ArrayList<>() {{add(records.get('g'));}};
        ArrayList<Integer> six = new ArrayList<>();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(zero);adj.add(one);adj.add(two);adj.add(three);adj.add(four);adj.add(five);adj.add(six);
        bfs(V, adj, ans, visited);
    }

    private static void bfs(int v, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans, boolean[] visited) {

        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        visited[0]=true;
        while(!stack.isEmpty()){
            ans.add(stack.peek());
            int k=stack.pop();
            for(int ele:adj.get(k)){
                if(!visited[ele]){
                    stack.push(ele);
                    visited[ele]=true;
                }
            }
        }
        System.out.println(ans);
    }

}
