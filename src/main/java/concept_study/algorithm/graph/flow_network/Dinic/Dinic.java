package concept_study.algorithm.graph.flow_network.Dinic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Dinic {

    static class Edge {

        // Vertex v (or "to" vertex) of a directed edge u-v.
        // "From" vertex u can be obtained using index in adjacent array.
        int v;

        // flow of data in edge
        int flow;

        // capacity
        int capacity;

        // Note: To store index of reverse edge in adjacency list so that we can quickly find it.
        int rev;

        public Edge(int v, int flow, int capacity, int rev) {
            this.v = v;
            this.flow = flow;
            this.capacity = capacity;
            this.rev = rev;
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < N; i++)
            adj.add(new ArrayList<>());

        addEdge(0, 1, 16);
        addEdge(0, 2, 13);
        addEdge(1, 2, 10);
        addEdge(1, 3, 12);
        addEdge(2, 1, 4);
        addEdge(2, 4, 14);
        addEdge(3, 2, 9);
        addEdge(3, 5, 20);
        addEdge(4, 3, 7);
        addEdge(4, 5, 4);

        System.out.format("Maximum flow : " + dinicMaxflow(0, 5));
    }

    static final int N = 6; // number of vertex
    static int[] level = new int[N]; // stores level of a node
    static ArrayList<ArrayList<Edge>> adj = new ArrayList<>();

    // add edge to the graph
    static void addEdge(int u, int v, int capacity) {

        // Forward edge : 0 flow and C capacity
        Edge a = new Edge(v, 0, capacity, adj.get(v).size());

        // Back edge : 0 flow and 0 capacity
        Edge b = new Edge(u, 0, 0, adj.get(u).size());

        adj.get(u).add(a);
        adj.get(v).add(b); // reverse edge
    }

    // Finds if more flow can be sent from s to t. Also assigns levels to nodes
    static boolean BFS(int s, int t) {
        Arrays.fill(level, -1);
        level[s] = 0;

        // Create a queue, enqueue source vertex and mark source vertex as visited here
        // level[] array works as visited array also.
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);

        while (!queue.isEmpty()) {
            int u = queue.poll();

            for (Edge edge : adj.get(u)) {
                if (level[edge.v] < 0 && edge.flow < edge.capacity) {
                    level[edge.v] = level[u] + 1;
                    queue.offer(edge.v);
                }
            }
        }

        return level[t] < 0 ? false : true;
    }


    /*
     * A DFS based function to send flow after BFS has figured out that
     * there is a possible flow and constructed levels. This function
     * called multiple times for a single call of BFS.
     *
     * flow : Current flow send by parent function call
     * Note) start[] : To keep track of next edge to be explored. start[i] stores count of edges explored from i.
     * u : Current vertex
     * t : Sink
     * */
    static int sendFlow(int u, int flow, int t, int[] start) {
        //  source?????? ????????????, ?????? ?????? ????????? ???????????? ??????????????? ???????????????
        //  ??????????????? sink??? ????????? ????????? ???????????? ????????? ??????

        if (u == t)  //base case: sink ??? ?????????
            return flow;

        // Traverse all adjacent edges one-by-one.
        for (; start[u] < adj.get(u).size(); start[u]++) {
            // edge??? ????????? ????????? ???????????? ????????? i??? ???????????? ?????? ?????? return??? ???????????? ?????????
            // ??? edge?????? ?????? ???????????????, ?????? ???????????? ?????? edge??? ????????? ??? ??????.

            // Pick next edge from adjacency list of u
            Edge edge = adj.get(u).get(start[u]);

            //?????? ???????????? 1?????? ?????? ?????? ????????? 0 ????????? ??????
            if (level[edge.v] == level[u] + 1 && edge.flow < edge.capacity) {

                // find minimum flow from u to t
                int curr_flow = Math.min(flow, edge.capacity - edge.flow);

                int temp_flow = sendFlow(edge.v, curr_flow, t, start); //dfs??? ?????? ?????? ??????

                // flow is greater than zero
                if (temp_flow > 0) { //???????????? ???????????? ????????? ??????????????? 0 ????????? ??????

                    // add flow to current edge
                    edge.flow += temp_flow;

                    // subtract flow from reverse edge of current edge
                    adj.get(edge.v).get(edge.rev).flow -= temp_flow;

                    return temp_flow;
                }
            }
        }

        return 0;
    }

    static int dinicMaxflow(int s, int t) {
        if (s == t)
            return -1;

        int total = 0;

        // Augment the flow while there is path from source to sink
        while (BFS(s, t)) {

            // store how many edges are visited from V { 0 to V }
            int[] start = new int[N];

            int flow;

            // while flow is not zero in graph from S to D
            while ((flow = sendFlow(s, Integer.MAX_VALUE, t, start)) != 0) {

                // Add path flow to overall flow
                total += flow;
            }
        }

        // return maximum flow
        return total;
    }
}
