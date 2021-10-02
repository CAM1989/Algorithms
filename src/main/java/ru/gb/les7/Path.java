package ru.gb.les7;

import java.util.LinkedList;

public abstract class Path {
    boolean[] marked;
    int[] edgeTo;
    int source;

    public Path(Graph g, int source) {
        this.source = source;
        edgeTo = new int[g.getVertexCount()];
        marked = new boolean[g.getVertexCount()];
        path(g, source);
    }

    public void path(Graph g, int source) {
    }

    public boolean hasPathTo (int dist) {
        return marked[dist];
    }

    public LinkedList<Integer> pathTo (int dist) {
        if (!hasPathTo(dist)) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = dist;
        while (vertex != source){
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }
}
