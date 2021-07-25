package africa.semicolon.chapterSixExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ComputerAssistedInstructions635App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String question;
        question = ComputerAssistedInstruction635.getQuestion();
        System.out.println("Choose a correct answer or enter -1 to end game");
        while (true){
            System.out.print(question);
            int response = scanner.nextInt();
            System.out.println(Arrays.toString(ComputerAssistedInstruction635.values));
            if( ComputerAssistedInstruction635.getAnswer(response)) {
                System.out.println("Very Good");
                question = ComputerAssistedInstruction635.getQuestion();
            } else if(response != -1){
                System.out.println("No, Try again");
            }
            if(response == -1) break;
        }
    }
}
