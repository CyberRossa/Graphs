package com.company;



public class Main {
    public static void main( String args[]) {
        Graphs g_0 = new Graphs(12);
        Graph_Hamilton hamilton = new Graph_Hamilton();

        g_0.Edge(0,1);
        g_0.Edge(1, 3);
        g_0.Edge(2, 4);
        g_0.Edge(5, 3);
        g_0.Edge(5, 7);
        g_0.Edge(4, 6);
        g_0.Edge(8, 6);
        g_0.Edge(7, 9);
        g_0.Edge(8,9);
        long startTime = System.nanoTime();
        g_0.isExist();
        long endTime = System.nanoTime();
        long est = endTime - startTime;
        System.out.println("Euler time is = "+ (est));
        int graph_0[][]= {{0,1,0,1,0,0,0,0,0,0},
                {1, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0,1, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0,1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0},
        };
        long startTime1 = System.nanoTime();
        hamilton.Ham_path(graph_0);
        long endTime1 = System.nanoTime();
        long ess = endTime1 - startTime1;
        System.out.println("hamilton time is = "+ (ess));


    }

}
