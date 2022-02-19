package com.company;

public class Graph_Hamilton {
    final int NoOfVertex = 9;
    int Edge[];
    int x = 1;
    int y = 0;

    public int edgeControl (int NoOfVertex, int graph[][],int Edge[], int pass){
        if(graph[Edge[pass - 1]][NoOfVertex] == 0){
            return y;
        }
        for(int index = 0; index < pass; index ++){
            if(Edge[index] == NoOfVertex)
                return y;
        }
        return x;
    }
    public int Hamilton (int graph[][], int Edge[], int pass) {
        if(pass == NoOfVertex){
            if(graph[Edge[pass - 1]][Edge[0]] == 1)
                return x;
            else{
                return y;
            }
        }
        for ( int index = 1 ; index < NoOfVertex ; index ++)
        {
            if(edgeControl(NoOfVertex,graph,Edge,pass) == x ){
               Edge[pass] = index;
               if(Hamilton(graph,Edge,pass + 1) == x){
                   return x;
               }
                Edge[pass] = -1;
            }
        }
        return y;
    }
    public int Ham_path(int graph[][]){
        Edge = new int[NoOfVertex];
        for(int index =0; index < NoOfVertex; index++)
            Edge[index] = -1;
        Edge[0] = 0;
        if(Hamilton(graph,Edge,1) == y) {
            System.out.println("no solution");
            return 0;
        }
        return 1;
    }
}
