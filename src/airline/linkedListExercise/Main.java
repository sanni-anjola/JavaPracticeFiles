package airline.linkedListExercise;

public class Main {
    public static void main(String[] args) {
        PointList pointList = new PointList();
        pointList.add(5, 3);
        pointList.add(3, 5);
        pointList.add(1, 6.3);
//        StdDraw.setPenColor(StdDraw.BLACK);
//        StdDraw.setPenRadius(0.1);
//        StdDraw.line(2,3,7,10);
//        StdDraw.line(5,6,7,-10);

        System.out.println(pointList);
    }
}
