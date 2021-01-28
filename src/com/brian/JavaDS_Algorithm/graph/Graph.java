package com.brian.JavaDS_Algorithm.graph;

import java.util.*;

public class Graph {

    //1. to store the vertex
    private List<String> vertexList;
    //2. to store the vertex connection relationships.
    private int[][] edges;
    //3. to represent the number of edges
    private int numOfEdges;
    //4.boolean array to store whether the vertex has been visited
    private boolean[] isVisited;

    public static void main(String[] args) {
        //test the code
        int n = 8;
        String[] vertexValue = {"1","2","3","4","5","6","7","8"};
        Graph graph = new Graph(n);
        for(String vertex: vertexValue) {
            graph.insertVertex(vertex);
        }

        //add edges
        //A-B,A-C,B-C,B-D,B-E
//        graph.insertEdge(0,1,1);
//        graph.insertEdge(0,2,1);
//        graph.insertEdge(1,2,1);
//        graph.insertEdge(1,3,1);
//        graph.insertEdge(1,4,1);

        graph.insertEdge(0,1,1);
        graph.insertEdge(0,2,1);
        graph.insertEdge(1,3,1);
        graph.insertEdge(1,4,1);
        graph.insertEdge(3,7,1);
        graph.insertEdge(4,7,1);
        graph.insertEdge(2,5,1);
        graph.insertEdge(2,6,1);
        graph.insertEdge(5,6,1);
        graph.showGraph();


        //A->B->C->D->E
        graph.dfs();
        //A->B->C->D->E
        graph.BFS();
    }

    public Graph(int n) {
        //initialization of edges and the list
        edges = new int[n][n];
        vertexList = new ArrayList<String>(n);
        //default to 0 edges
        numOfEdges = 0;
    }

    //get the first neighbour vertex index
    /**
     *
     * @param index if exist, return index else return -1
     * @return first neighbour
     */
    public int getFirstNeighbour(int index){
        for(int j=0;j<vertexList.size();j++){
            if(edges[index][j]>0) return j;
        }
        return -1;
    }

    //based on the previous vertex, get the next neighbour vertex
    public int getNextNeighbour(int v1, int v2){
        for(int j=v2+1;j<vertexList.size();j++){
            if(edges[v1][j]>0) return j;
        }
        return -1;
    }

    //DFS
    private void dfs(boolean[] isVisited, int i){
        //first we visit this node
        System.out.print(getValueByIndex(i) + "-->");
        //set this code as visited
        isVisited[i] = true;
        int w = getFirstNeighbour(i);
        while(w!=-1){
            if(!isVisited[w]) dfs(isVisited,w);
            //if it's been visited
            w = getNextNeighbour(i,w);
        }
    }

    //reload on dfs, loop over all the vertex and do dfs
    public void dfs(){
        isVisited = new boolean[getNumberOfVertex()];
        //loop over all vertexList
        for(int i=0;i<vertexList.size();i++){
            if(!isVisited[i]) dfs(isVisited,i);
        }
    }

    //BFS
    public void BFS(){
        isVisited = new boolean[getNumberOfVertex()];
        for(int i=0;i<getNumberOfVertex();i++){
            if(!isVisited[i]) BFS(isVisited,i);
        }
    }

    //a method for one node's BFS
    private void BFS(boolean[] isVisited,int i){
        int u; //the first vertex in the queue
        int w; //the neighbour vertex
        // Queue, a recorder on the sequence of vertex
        LinkedList<Integer> queue = new LinkedList<>();
        //visit the node
        System.out.println(getValueByIndex(i)+"->");
        isVisited[i] = true;
        //add the vertex to the queue
        queue.addLast(i);
        while (!queue.isEmpty()){
            // take the head node
            u = queue.removeFirst();
            // get the
            w = getFirstNeighbour(u);
            //as long as u is not -1,
            while (w!=-1) {
                //check visited
                if(!isVisited[w]) {
                    System.out.print(getValueByIndex(w)+"->");
                    isVisited[w] = true;
                    queue.addLast(w);
                }
                //based on u, found the next neighbor of w
                w = getNextNeighbour(u,w); // this is the place of showing the BFS
            }
        }
    }


    //common methods in a graph ds

    //1. get number of vertex
    public int getNumberOfVertex(){
        return vertexList.size();
    }

    //2. get number of edges
    public int getNumOfEdges(){
        return numOfEdges;
    }

    //3. return the ith corresponding value
    public String getValueByIndex(int i){
        return vertexList.get(i);
    }

    //4. return v1,v2 relationship
    public int getWeight(int v1, int v2){
        return edges[v1][v2];
    }

    //5. show whole graph relationship
    public void showGraph(){
        for(int[] nums: edges){
            System.out.println(Arrays.toString(nums));
        }
    }

    //insert a vertex
    public void insertVertex(String vertex){
        vertexList.add(vertex);
    }

    /**
     *
     * @param v1 pos1, which vertex in the vertexList
     * @param v2 pos2, which vertex in the vertexList
     * @param weight 1 or 0. 1 for connected, 0 for not connected
     */
    public void insertEdge(int v1, int v2, int weight){
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        numOfEdges++;
    }

}
