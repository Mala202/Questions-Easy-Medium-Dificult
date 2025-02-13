package difficult_Programing_Quetiones;

import java.util.*;


public class Quetions10_Path_in_a_weighted_graph {
// Write a program to find the shortest path in a weighted graph using Dijkstra's algorithm in Java.
	    static final int V = 9;
		private int[] dist;
	    int minDistance(int dist[], boolean[] sptSet)
	    {
	        int min = Integer.MAX_VALUE, min_index = -1;
	 
	        for (int v = 0; v < V; v++)
	            if (sptSet[v] == false && dist[v] <= min) {
	                min = dist[v];
	                min_index = v;
	            }
	 
	        return min_index;
	    }
	    void printSolution(int dist[], int n)
	    {
	        System.out.println("Vertex  Distance from Source");
	        for (int i = 0; i < V; i++)
	            System.out.println(i + " tt " + dist[i]);
	    }
	    void dijkstra(int graph[][], int src)
	    {
	        int dist[] = new int[V];
	        
	        boolean[] sptSet = null;
			for (int i = 0; i < V; i++) {
	            dist[i] = Integer.MAX_VALUE;
	            sptSet[i] = false;
	        }
	        dist[src] = 0;
	        for (int count = 0; count < V - 1; count++) {
	            int u = minDistance(dist, sptSet);
	            sptSet[u] = true;
	            for (int v = 0; v < V; v++)
	                if (!sptSet[v] && graph[u][v] != 0 && 
	                   dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
	                    dist[v] = dist[u] + graph[u][v];
	        }
	        printSolution(dist, V);
	    }
	    public static void main(String[] args)
	    {
	        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
	                                      { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
	                                      { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
	                                      { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
	                                      { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
	                                      { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
	                                      { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
	                                      { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
	                                      { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
	        ShortestPath t = new ShortestPath();
	        t.dijkstra(graph, V);
	        return;
	    }
	

	}

