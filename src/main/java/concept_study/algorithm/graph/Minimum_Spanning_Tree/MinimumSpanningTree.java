package concept_study.algorithm.graph.Minimum_Spanning_Tree;

import java.util.*;

public class MinimumSpanningTree {

    public static void main(String[] args) {

        // https://algotree.org/algorithms/minimum_spanning_tree/prims_java/
        // https://bepoz-study-diary.tistory.com/163
        // https://velog.io/@agugu95/Prims-Algorithm%ED%94%84%EB%A6%BC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98

        int N = 6;
        ArrayList<int[]> edges = new ArrayList<>();

        // (source, destination, cost)
        edges.add(new int[]{0, 1, 4});
        edges.add(new int[]{0, 2, 1});
        edges.add(new int[]{0, 3, 5});

        edges.add(new int[]{1, 0, 4});
        edges.add(new int[]{1, 3, 2});
        edges.add(new int[]{1, 4, 3});
        edges.add(new int[]{1, 5, 3});

        edges.add(new int[]{2, 0, 1});
        edges.add(new int[]{2, 3, 2});
        edges.add(new int[]{2, 4, 8});

        edges.add(new int[]{3, 0, 5});
        edges.add(new int[]{3, 1, 2});
        edges.add(new int[]{3, 2, 2});
        edges.add(new int[]{3, 4, 1});

        edges.add(new int[]{4, 1, 3});
        edges.add(new int[]{4, 2, 8});
        edges.add(new int[]{4, 3, 1});
        edges.add(new int[]{4, 5, 4});

        edges.add(new int[]{5, 1, 3});
        edges.add(new int[]{5, 4, 4});

        // MST = 9
        int minCost;

        System.out.println("\nPrim's -----------------------------------");
        minCost = lazyPrims(edges, N);
        System.out.println(minCost == 9);

        System.out.println("\nKruskal -----------------------------------");
        minCost = kruskal(edges, N);
        System.out.println(minCost == 9);
    }

    static int kruskal(ArrayList<int[]> edges, int n) {

        int minCost = 0;
        ArrayList<int[]> mst = new ArrayList<>();

        DisjointSetUnion dsu = new DisjointSetUnion();
        int[] parent = dsu.makeSet(new int[n]);

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[2]));

        // cost 기준 정렬
        for (int[] edge : edges)
            pq.offer(edge);

        while (!pq.isEmpty()) {
            int[] edge = pq.poll();

            // 사이클 확인
            if (dsu.find(parent, edge[0]) == dsu.find(parent, edge[1]))
                continue;

            dsu.union(parent, edge[0], edge[1]);

            minCost += edge[2];
            mst.add(edge);
        }

        print(mst);
        return minCost;
    }

    static int lazyPrims(ArrayList<int[]> edges, int n) {

        int mincost = 0;
        ArrayList<int[]> mst = new ArrayList<>();

        boolean[] visited = new boolean[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[2]));
        Queue<Integer> q = new LinkedList<>();

        // 시작점 초기화
        q.offer(edges.get(0)[0]);

        while (!q.isEmpty()) {
            int cur = q.poll();
            visited[cur] = true;

            // 현재 vertex에서 인접한 노드중 방문하지 않은 노드를 우선순위 큐에 넣음.
            for (int[] edge : edges) {
                if (cur == edge[0] && !visited[edge[1]]) {
                    pq.offer(edge);
                }
            }

            // 인접한 노드 중에 비용이 가장 작은 노드 처리
            while (!pq.isEmpty()) {
                int[] edge = pq.poll();

                if (visited[edge[1]])
                    continue;

                visited[edge[1]] = true;
                mincost += edge[2];
                q.offer(edge[1]);
                mst.add(edge);
                break;
            }
        }

        print(mst);
        return mincost;
    }

    static void print(ArrayList<int[]> mst) {
        for (int[] edge : mst) {
            int source = edge[0];
            int destination = edge[1];
            int cost = edge[2];
            System.out.format("%d -> %d : %d", source, destination, cost);
            System.out.println();
        }
    }
}







