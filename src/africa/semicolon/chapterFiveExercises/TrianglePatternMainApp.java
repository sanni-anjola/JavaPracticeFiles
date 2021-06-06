package africa.semicolon.chapterFiveExercises;

import java.util.Scanner;

public class TrianglePatternMainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows of shapes: ");
        int userInput = scanner.nextInt();
        TrianglePattern trianglePattern = new TrianglePattern();

        if(userInput > 1) {
            System.out.println(trianglePattern.pattern1(userInput));
            System.out.println(trianglePattern.pattern2(userInput));
            System.out.println(trianglePattern.pattern3(userInput));
            System.out.println(trianglePattern.pattern4(userInput));
            System.out.println(trianglePattern.allPatterns(userInput));
        }
    }
}
