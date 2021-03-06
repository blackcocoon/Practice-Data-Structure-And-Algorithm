# 작성중...

- 아래 항목을 시간이 날때마다 개념 정리와 예제 코드를 작성해나간다.

## Algorithm

### Sort

- [bubble sort](src/main/java/concept_study/algorithm/sort/bubble_sort)
- [counting sort](src/main/java/concept_study/algorithm/sort/counting_sort)
- [heap sort](src/main/java/concept_study/algorithm/sort/heap_sort)
- [insertion sort](src/main/java/concept_study/algorithm/sort/insertion_sort)
- [merge sort](src/main/java/concept_study/algorithm/sort/merge_sort)
- [pancake sort](src/main/java/concept_study/algorithm/sort/pancake_sort)
- [quick sort](src/main/java/concept_study/algorithm/sort/quick_sort)
- radix sort
- select sort
- shell sort
- [topological sort](src/main/java/concept_study/algorithm/graph/Topological_Sorting/Baekjoon_2252_Line_up.java)
- tree sort

---

### Divide and Conquer

- [quick sort](src/main/java/concept_study/algorithm/sort/quick_sort)
- [merge sort](src/main/java/concept_study/algorithm/sort/merge_sort)

---

### Recursion

- [Hanoi Tower](src/main/java/concept_study/algorithm/recursion/Hanoi_Tower.java)
- [Recursion DFS](src/main/java/concept_study/algorithm/graph/Traversal/Basic_DFS_BFS_GraphSearch.java)

---

### Traversal

- Tree
  - [pre-order](src/main/java/concept_study/algorithm/graph/Traversal/tree/PreOrder.java)
  - [in-order](src/main/java/concept_study/algorithm/graph/Traversal/tree/InOrder.java)
  - [post-order](src/main/java/concept_study/algorithm/graph/Traversal/tree/PostOrder.java)
  - [level-order](src/main/java/concept_study/algorithm/graph/Traversal/tree/LevelOrder.java)
  - DFS : preorder, inorder, postorder
  - BFS : level order
- [Graph](src/main/java/concept_study/algorithm/graph/Traversal/Basic_DFS_BFS_GraphSearch.java)
  - DFS : stack, recursive
  - BFS : queue

---

### Search

- [linear search](src/main/java/concept_study/algorithm/search/LinearSearch.java)
- [binary search](src/main/java/concept_study/algorithm/search/BinarySearch.java)
  - [lower bound](src/main/java/concept_study/algorithm/search/LowerBound.java)
  - [upper bound](src/main/java/concept_study/algorithm/search/UpperBound.java)
- [jump search](src/main/java/concept_study/algorithm/search/JumpSearch.java)
- [sequential search](src/main/java/concept_study/algorithm/search/SequentialSearch.java)
- [interpolation search](src/main/java/concept_study/algorithm/search/InterpolationSearch2.java)
- [quick select](src/main/java/concept_study/algorithm/search/QuickSelect.java)
- [Parametric search](src/main/java/concept_study/algorithm/graph/Tree/Parametric_Search)
- fibonacci search
- Brute-Force Search(= Exhaustive Search)
  - basic
  - bitmask
  - recursion
  - permutation
  - bfs/dfs
- ternary search

---

### mathematics

- [permutation](src/main/java/concept_study/algorithm/mathematics/Permutation2.java)
  - recursive
  - lexicographic order
  - next permutation
  - duplicate permutation
- combination
  - [recursive](src/main/java/concept_study/algorithm/mathematics/Combination2.java)
  - [lexicographic order](src/main/java/concept_study/algorithm/mathematics/Combination1.java)
  - [next combination](src/main/java/concept_study/algorithm/mathematics/Combination1.java)
  - [Pascal's triangle](src/main/java/concept_study/algorithm/mathematics/Combination2.java)
  - [2D Array combination](src/main/java/concept_study/algorithm/mathematics/Combination_2d_Array.java)
  - duplicate combination
- [prime number](src/main/java/concept_study/algorithm/mathematics/Prime_Number)
- [modular](src/main/java/concept_study/algorithm/mathematics/Modular_Arithmetic)
- [GCD/LCM](src/main/java/concept_study/algorithm/mathematics/GCD_LCM.java)
  - Euclidean algorithm
- [power set](src/main/java/concept_study/algorithm/mathematics/PowerSet.java)

---

### string

- [String Hashing](src/main/java/concept_study/algorithm/string/StringHashing.java)
- [Rabin–karp](src/main/java/concept_study/algorithm/string/Rabin_Karp.java)
- [KMP](src/main/java/concept_study/algorithm/string/KMP2.java)
- [Boyer Moore](src/main/java/concept_study/algorithm/string/Original_Boyer_Moore.java)
- Suffix Array

---

### Bit

- bit mask
- bit set

---

### greedy

- Minimum number of Coins
- 강의실/회의실 배정
- Minimum Number of Platforms Required for a Railway/Bus Station
- Fractional Knapsack Problem
- Dijkstra’s Algorithm
- Kruskal

---

### [two point](src/main/java/concept_study/algorithm/array/two_pointer/Two_Pointer.java)

---

### Sliding Window

---

### simulation

---

### dynamic programming

- memoization / top-down / bottom-up / 점화식
- famous example
  - Fibonacci numbers
  - [Climbing Stairs](src/main/java/solve_practice_problems/LeetCode/dp/LeetCode_70_Easy_Climbing_Stairs.java)
  - Coin Change Problem
    - [case 1](src/main/java/solve_practice_problems/LeetCode/dp/LeetCode_322_Medium_Coin_Change.java)
    - [case 2](src/main/java/solve_practice_problems/LeetCode/dp/LeetCode_518_Medium_Coin_Change_2.java)
  - [Longest Common Subsequence](src/main/java/solve_practice_problems/LeetCode/dp/LeetCode_1143_Medium_Longest_Common_Subsequence.java)
  - [Longest Increasing Subsequence](src/main/java/concept_study/algorithm/array/Longest_Increasing_Subsequence/Longest_Increasing_Subsequence.java)
  - Longest Palindromic Subsequence
  - [Longest Palindromic Substring](src/main/java/solve_practice_problems/LeetCode/dp/LeetCode_5_Medium_Longest_Palindromic_Substring.java)
  - 0-1 KnapSack
  - Travelling Salesman
  - Edit Distance
  - Matrix Chain Multiplication

---

### backTracking

- decision tree(= state space tree) / promising / pruning
- famous example
  - Palindrome Partitioning
  - n-queen
  - sudoku
  - 0-1 knapsack

---   

### Minimum Spanning Tree

- kruskal
- prim

---

### shortest path

- [Dijkstra](src/main/java/concept_study/algorithm/graph/Shortest_Path/Dijkstra.java)
- [BellmanFord](src/main/java/concept_study/algorithm/graph/Shortest_Path/BellmanFord.java)
- [FloydWarshall](src/main/java/concept_study/algorithm/graph/Shortest_Path/FloydWarshall.java)
- A*

---

### Lowest Common Ancestor

- simple
- binary search tree
- using parent pointer
- Binary lifting in Lowest Common Ancestor

--- 

### Range Query

- Native approach
- Square root decomposition
- Segment tree
- Fenwick tree
- Sparse table
- Cartesian tree

---

### Articulation Points And Bridges

- 단절점
- 단절선

---

### flow network

- Minimum Cost Maximum Flow
- Bipartite_Matching
  - [recursion solution](src/main/java/concept_study/algorithm/graph/flow_network/Bipartite_Matching/Bipartite_Matching.java)
- [ford fulkerson](src/main/java/concept_study/algorithm/graph/flow_network/Ford_Fulkerson/Ford_Fulkerson.java)
- [edmonds karp](src/main/java/concept_study/algorithm/graph/flow_network/Ford_Fulkerson/Edmonds_Karp.java)
- MCMF
- dinic
- [minimum cut](src/main/java/concept_study/algorithm/graph/flow_network/Ford_Fulkerson/Minimum_Cut.java)

---

### Strongly Connected Component

- [kosaraju](src/main/java/concept_study/algorithm/graph/Strongly_Connected_Component/Kosaraju.java)
- [tarjan](src/main/java/concept_study/algorithm/graph/Strongly_Connected_Component/Tarjan.java)

---

### 2-sat

---

### Heuristics

---

### Biconnected Component

---


### CPU Scheduling
- FCFS
  - same arrival time
  - different arrival time
- SJF(Shortest Job First)
  - Non-preemptive
  - Preemptive
- Priority
  - Non-preemptive
    - same arrival time
    - different arrival time
  - Preemptive Priority
- LRTF(Longest Remaining Time First)



### Other

- Euler Tour Technique
- Longest_Common_Prefix
- Longest_Common_Subsequence
- [Prefix_Sum](src/main/java/concept_study/algorithm/array/prefix_sum/Prefix_Sum.java)
- Sqrt_Decomposition
- Longest Common Prefix array (LCP)
- Directed_graph_cycle
- 2d array 회전
- 2d lazy update

<br/>
<br/>
<br/>
<br/>

## Data structure

### Array

- 일반
- 원형
- Dynamic Array

---

### LinkedList

- 단순
- 이중
- 원형

---  

### Queue

- basic queue
- circular queue
- priority queue

---

### Stack

### Deque

---

### heap

- heapify
- Min-Max

---

### Tree

- 일반
- binary tree
  - Perfect binary tree
  - Full binary tree
  - Complete binary tree
  - Skewed binary tree
  - Balanced binary tree
- Spanning Tree
- Decision tree
- state space tree

---

### Graph

- 방향
- 무방향
- DAG
- [Adjacency matrix](src/main/java/concept_study/data_structure/Graph/Adjacency_Matrix.java)
- [Adjacency list](src/main/java/concept_study/data_structure/Graph/Adjacency_List.java)
- [edge list](src/main/java/concept_study/data_structure/Graph/Edge_List.java)

---

### Hash table

---

### [trie](src/main/java/concept_study/data_structure/Graph/Tree/Trie/Trie.java)

---

### cache

- [LRU](src/main/java/concept_study/data_structure/Cache/LRU)

---

### Disjoint Set(Union Find)

- [link 1](src/main/java/concept_study/algorithm/graph/Union_Find)
- [link 2](src/main/java/concept_study/algorithm/graph/Minimum_Spanning_Tree/DisjointSetUnion.java)

---

### segment tree

- basic
- iterative segment tree
- lazy segment tree
- Persistent Segment Tree
- lazy segment tree

---

### Fenwick tree(= binary indexed tree)

- [link](src/main/java/concept_study/data_structure/Graph/Tree/Binary_Indexed_Tree)

---

### Suffix Array

### Suffix Tree

---

### Self-Balancing BSTs

- AVL
- Splay Tree
- B Tree
- B+ Tree
- Red Black Tree
- ScapeGoat Tree and Treap

---

### Sparse tree

### Sparse table

---

### Square Root Decomposition

---

### k Dimensional Tree

---

<!--
### n-ary Trees and LCA
-->

<br/>
<br/>
<br/>

### 참조 사이트

- https://afteracademy.com/blogs/ds-algo
- https://blog.naver.com/PostList.nhn?blogId=jqkt15&from=postList&categoryNo=10&parentCategoryNo=10
- https://cp-algorithms.com/
- https://hgkim.gitbooks.io/concept_study.algorithm/content/
- https://1ambda.github.io/concept_study.algorithm/
- https://www.geeksforgeeks.org/searching-algorithms/?ref=ghm
- https://github.com/williamfiset/algorithms
- https://sites.google.com/site/indy256/algo
- https://blog.naver.com/PostList.nhn?blogId=kks227&categoryNo=299&skinType=&skinId=&from=menu&userSelectMenu=true
- https://www.crocus.co.kr/category/Applied/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98?page=1
- https://solved.ac/
- https://www.geeksforgeeks.org/advanced-data-structures/

- https://www.geeksforgeeks.org/advanced-data-structures/
- https://iq.opengenus.org/list-of-advanced-data-structures/