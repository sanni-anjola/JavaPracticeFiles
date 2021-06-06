package africa.semicolon.chapterFiveExercises;

import java.util.Scanner;

public class StudentHighestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of Students: ");
        int numberOfStudents = scanner.nextInt();

        int count = 1;
        String name;
        int score;
        int highest = Integer.MIN_VALUE;
        String nameOfStudentWithTheHighestScore = "";

        while (count <= numberOfStudents){
            System.out.printf("Enter Student %d's name: ", count);
            name = scanner.nextLine();
            
            System.out.printf("Enter Student %d's score: ", count);
            score = scanner.nextInt();


            if(highest < score){
                nameOfStudentWithTheHighestScore = name;
                highest = score;

            }

            count++;
        }

        System.out.printf("%s had the highest score with %d%n", nameOfStudentWithTheHighestScore, highest);
    }
}
