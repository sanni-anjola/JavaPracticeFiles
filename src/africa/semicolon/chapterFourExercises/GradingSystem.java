package africa.semicolon.chapterFourExercises;

import java.util.Scanner;

/*
Program for a School Grading System
Pseudocode:
1. Get the score from the user
2. if the score is 90 and above
        display "A"
   but if the score is between 80 and 89
        display "B"
   or if the score is between 70 qnd 79
        display "C"
   or if the score is between 60 and 69
        display "D"
   any other score (i.e below 60)
        display "F"

 */
public class GradingSystem {
    public static void main(String[] args) {
        System.out.print("Enter the score: ");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if(score >= 90){
            System.out.println("A");
        }else if(score >= 80){
            System.out.println("B");
        }else if(score >= 70){
            System.out.println("C");
        }else if(score >= 60){
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
