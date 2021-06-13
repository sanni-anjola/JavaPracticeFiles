package africa.semicolon.chapterSevenExercises;

import java.util.Scanner;

public class GradeBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] grades = {"100", "90-99", "80-89", "70-79", "60-69", "50-59","40-49", "30-39", "20-29", "10-19", "00-09"};
        int[] gradeCounts = new int[grades.length];
        System.out.print("How many students score are you inputting: ");
        final int ARRAY_LENGTH = scanner.nextInt();

        int[] arrayOfScores = new int[ARRAY_LENGTH];

        for (int i = 0; i < arrayOfScores.length; i++) {
            System.out.print("input a score: ");
            arrayOfScores[i] = scanner.nextInt();
        }

        for (int num:
             arrayOfScores) {
                switch (num / 10){
                    case 10 -> gradeCounts[0]++;
                    case 9 -> gradeCounts[1]++;
                    case 8 -> gradeCounts[2]++;
                    case 7 -> gradeCounts[3]++;
                    case 6 -> gradeCounts[4]++;
                    case 5 -> gradeCounts[5]++;
                    case 4 -> gradeCounts[6]++;
                    case 3 -> gradeCounts[7]++;
                    case 2 -> gradeCounts[8]++;
                    case 1 -> gradeCounts[9]++;
                    case 0 -> gradeCounts[10]++;
                }
        }

        int count = 0;
        for (int num:
             gradeCounts) {
            if (num != 0) {
                System.out.printf("%5s: ",grades[count]);
                for (int i = 0; i < num; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            count++;
        }

    }
}
