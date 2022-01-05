package africa.semicolon.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class TriangleFromPoints {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 4, 3, 2, 3}, new int[]{4, 3, 1, 1, 2})));
        System.out.println(Arrays.toString(solution(new int[]{0,1,3,0,0, 2}, new int[]{3,0,0,1,2,0})));
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 2, 4, 4, 5, 6}, new int[]{0, 1, 2, 3, 4, 5, 6})));
        System.out.println(Arrays.toString(solution(new int[]{0}, new int[]{0})));
    }

    public static int[] solution(int[] X, int[] Y){
        if(X.length < 3 || Y.length < 3) return new int[]{};

        int first = 0;
        int second =0;
        int third =0;
        int minD = Integer.MAX_VALUE;

        for (int i = 0; i < X.length; i++)
        {
            if (i == first)
                continue;

            // Get distance from first point and choose
            // nearest one
            int d = distance(new Point(X[i], Y[i]),
                    new Point(X[first], Y[first]));
            if (minD > d)
            {
                minD = d;
                second = i;
            }
        }

        // Pick third point by finding the second closest
        // point with different slope.
        minD = Integer.MAX_VALUE;
        for (int i = 0; i < X.length; i++)
        {
            // if already chosen point then skip them
            if (i == first || i == second)
                continue;

            // get distance from first point
            int d = distance(new Point(X[i], Y[i]),
                    new Point(X[first], Y[first]));

            /* the slope of the third point with the first
                point should not be equal to the slope of
                second point with first point (otherwise
                they'll be collinear) and among all such
                points, we choose point with the smallest
                distance */
            // here cross multiplication is compared instead
            // of division comparison
            if ((X[i] - X[first]) *
                    (Y[second] - Y[first]) !=
                    (X[second] - X[first]) *
                            (Y[i] - Y[first]) &&
                    minD > d)
            {
                minD = d;
                third = i;
            }
        }
        return new int[]{first, second, third};

    }
    public static int distance(Point a, Point b){
        return (int) Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

//    public static double area(Point a, Point b, Point c){
//        double ab = distance(a, b);
//        double ac = distance(a, c);
//        double bc = distance(b, c);
//
//        double s = (ab + ac + bc) / 2;
//
//        return Math.sqrt(s * (s - ab) * (s - ac) * (s - bc));
//    }

    record Point(double x, double y) {

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

    }
}



