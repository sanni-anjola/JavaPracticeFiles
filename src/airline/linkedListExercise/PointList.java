package airline.linkedListExercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class PointList {
    private Node top;
    private List<Node> nodeList;
    public PointList() {
        nodeList = new ArrayList<>();
    }

    public  void add(double x, double y){
        nodeList.add(new Node(x, y));
    }

    public void insert(double x, double y){
        add(x, y);
        nodeList.sort(Comparator.comparingDouble(Node::getX));
    }

    public void connectTheDots(){
        IntStream.range(0, nodeList.size() - 1)
                .forEach(i -> StdDraw.line(nodeList.get(i).getX(), nodeList.get(i).getY(), nodeList.get(i+1).getX(), nodeList.get(i+1).getY()));
    }
    @Override
    public String toString(){
        return nodeList.toString().replace(",", "");
    }
}
