package africa.semicolon.chapterFourExercises;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your score:  ");
        int score = userInput.nextInt();

//        if(score < 60){
//            System.out.println("Sorry, You failed!!!");
//        }
//        if(score >= 60){
//            System.out.println("Congratulations, You passed");
//        }

        if(score < 60){
            System.out.println("Sorry, You failed!!!");
        } else {
            System.out.println("Congratulations, You passed");
        }
    }
}
