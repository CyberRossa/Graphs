package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Graphs {
    public int NoOfV ;
    public LinkedList<Integer> Matrix[];
    int x = 1;
    int y = 0;

    // the graph is creating here
    Graphs(int V){
        NoOfV = V;
        Matrix = new LinkedList[NoOfV];
        for (int index = 0 ; index < NoOfV; index++){
            Matrix[index] = new LinkedList();
        }

    }
    public void Edge(int V, int a) {
        Matrix[V].add(a);
        Matrix[a].add(V);
        // undirected graph
    }
    public void  Search(int V, boolean pass[]){
        pass[V] = true;
        Iterator<Integer> i = Matrix[V].listIterator();
        while(i.hasNext())
        {
            int next = i.next();
            if(!pass[next]){
                Search(next,pass);
            }
        }
        // see which nodes are passed
    }

    public int Connection(){

        boolean pass[] = new boolean[NoOfV];
        int index;
        for(index =0; index < NoOfV; index ++)
            pass[index] = false ;

        for(index =0; index < NoOfV; index ++){
            if(Matrix[index].size() !=0 )
                break;
        }
        if( index == NoOfV)
            return x;
        Search(index, pass);

        for(index = 0; index < NoOfV; index ++){
            if((pass[index] == false ) && Matrix[index].size() > 0) {
                return y;
            }
        }
        return x;

    }
    public int EulerianExist(){
        int odd = 0;
        if(Connection() == y)
            return 0;
        for(int index = 0; index < NoOfV; index ++){
            //count odd vertices
            if(Matrix[index].size() %2 != 0){
                odd ++;
            }

        }
        if(odd > 2)
            return  0;

        return 1;
    }
    public void isExist (){
        int sol = EulerianExist();
        if(sol == 0){
            System.out.println("graph is not eulerian");

        }
        else{
            System.out.println("Graph has a euler path");
        }

    }

}
