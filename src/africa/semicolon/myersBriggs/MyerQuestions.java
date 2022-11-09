package africa.semicolon.myersBriggs;

import java.util.Scanner;

public class MyerQuestions {
    private String[] questions;

    public MyerQuestions(int numberOfQuestions) {
        questions = new String[numberOfQuestions];
    }

    private void serveQuestion(String question){
        System.out.println(question);
    }

    private String getOption(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String[] getQuestions() {
        return questions;
    }

    public void setQuestions(String[] questions) {
        this.questions = questions;
    }

    public String[] serveQuestions(){
        String[] options = new String[questions.length];
        for (int i = 0; i < questions.length; i++) {
            serveQuestion(questions[i]);
            options[i] = getOption();
        }
        return options;
    }
}
