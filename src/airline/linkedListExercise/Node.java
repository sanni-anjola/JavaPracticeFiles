package airline.linkedListExercise;

public class Node {
    private double x;
    private double y;
    private Node xLink;
    private Node yLink;

    public Node(double x, double y, Node xLink, Node yLink) {
        this.x = x;
        this.y = y;
        this.xLink = xLink;
        this.yLink = yLink;
    }

    public Node(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Node getXLink() {
        return xLink;
    }

    public void setXLink(Node xLink) {
        this.xLink = xLink;
    }

    public Node getYLink() {
        return yLink;
    }

    public void setYLink(Node yLink) {
        this.yLink = yLink;
    }

    @Override
    public String toString() {

        return String.format(" (%5.3f, %5.3f) ", x, y);
    }
}
