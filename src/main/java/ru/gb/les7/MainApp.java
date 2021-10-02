package ru.gb.les7;

public class MainApp {
    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(1,2);
        graph.addEdge(0,1);
        graph.addEdge(3,6);
        graph.addEdge(0,3);
        graph.addEdge(4,7);
        graph.addEdge(4,5);
        graph.addEdge(7,8);
        graph.addEdge(6,9);
        graph.addEdge(6,7);
        graph.addEdge(5,2);

        BreadthFirstPath bfp = new BreadthFirstPath(graph, 1);
        System.out.println(bfp.pathTo(3));
    }
}
