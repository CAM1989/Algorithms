package ru.gb.les7;

public class DepthFirstPath extends Path{


    public DepthFirstPath(Graph g, int source) {
        super(g, source);
    }

    @Override
    public void path(Graph g, int source) {
        marked[source] = true;
        for (int w: g.getAdjList(source)) {
            if (!marked[w]) {
                edgeTo[w] =source;
                path(g,w);
            }
        }
    }

//   private boolean[] marked;
//    private int[] edgeTo;
//    private int source;
//
//    public DepthFirstPath(Graph g, int source) {
//        this.source = source;
//        edgeTo = new int[g.getVertexCount()];
//        marked = new boolean[g.getVertexCount()];
//        dfs(g, source);
//    }
//
//    private void dfs(Graph g, int v) {
//        marked[v] = true;
//        for (int w: g.getAdjList(v)) {
//            if (!marked[w]) {
//                edgeTo[w] =v;
//                dfs(g,w);
//            }
//        }
//    }
//
//    public boolean hasPathTo (int dist) {
//        return marked[dist];
//    }
//
//    public LinkedList<Integer> pathTo (int dist) {
//        if (!hasPathTo(dist)) {
//            return null;
//        }
//        LinkedList<Integer> stack = new LinkedList<>();
//        int vertex = dist;
//        while (vertex != source){
//            stack.push(vertex);
//            vertex = edgeTo[vertex];
//        }
//        return stack;
//    }
}
