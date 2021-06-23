package africa.semicolon.chapterSevenExercises;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter number of student: ");
        int numberOfStudents = inputCollector.nextInt();
        System.out.print("Enter number of subject: ");
        int numberOfSubjects = inputCollector.nextInt();

        int[][] scores = new int[numberOfStudents][numberOfSubjects];
        System.out.println("\n################ Collecting Scores ########################\n");
        int score;
        int student = 1;
        for(int[] students : scores){
            System.out.printf("Enter scores for student %d%n", student++);
            System.out.println("____________________________________");
            for (int subject = 0; subject < numberOfSubjects; subject++) {
                System.out.printf("Enter score for subject %d%n", subject+1);
                score = inputCollector.nextInt();
                students[subject] = score;
            }
        }
        System.out.println("\n################ Display Scores ########################\n");
        System.out.printf("%-15s", "Student's Name");
        for(int subject = 1; subject <= numberOfSubjects; subject++){
            System.out.printf("| %-10s", "Subject "+subject);
        }
        System.out.println();
        System.out.printf("%s%n", "-".repeat(30 + (10 * numberOfSubjects)));
        student = 1;
        for(int[] students : scores){
            System.out.printf("%-15s", "Student "+student++);
            for(int subjectScore : students){
                System.out.printf("| %-10d", subjectScore);
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(scores));
    }
}
