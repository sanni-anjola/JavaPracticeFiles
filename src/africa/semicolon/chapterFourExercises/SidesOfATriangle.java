package africa.semicolon.chapterFourExercises;

import java.util.Scanner;

public class SidesOfATriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first side of the triangle: ");
        int firstSide = scanner.nextInt();
        System.out.print("Enter the first side of the triangle: ");
        int secondSide = scanner.nextInt();
        System.out.print("Enter the first side of the triangle: ");
        int thirdSide = scanner.nextInt();

        System.out.println(determineTriangle(firstSide, secondSide, thirdSide));
        System.out.println(determineTRightTriangle(firstSide, secondSide, thirdSide));



    }

    public static boolean determineTriangle(int firstSide, int secondSide, int thirdSide){
        boolean firstCompare = firstSide + secondSide > thirdSide;
        boolean secondCompare = firstSide + thirdSide > secondSide;
        boolean thirdCompare = secondSide + thirdSide > firstSide;

        if(firstCompare && secondCompare && thirdCompare){
            return true;
        }
        return false;
    }


    public static boolean determineTRightTriangle(int firstSide, int secondSide, int thirdSide){
        boolean firstCompare = firstSide * firstSide + secondSide * secondSide == thirdSide * thirdSide;
        boolean secondCompare = firstSide * firstSide + thirdSide * thirdSide == secondSide * secondSide;
        boolean thirdCompare = secondSide * secondSide + thirdSide * thirdSide == firstSide * firstSide;
        if(firstCompare || secondCompare || thirdCompare){
            return true;
        }
        return false;
    }
}
