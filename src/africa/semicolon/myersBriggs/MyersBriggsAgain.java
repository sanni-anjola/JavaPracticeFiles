package africa.semicolon.myersBriggs;

import java.util.Scanner;

public class MyersBriggsAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] questionnaire = new String[20][2];

        questionnaire[0][0] = "expend energy, enjoy groups";
        questionnaire[0][1] = "conserve energy, enjoy one-on-one";
        questionnaire[1][0] = "interpret literally";
        questionnaire[1][1] = "look for meaning and possibilities";
        questionnaire[2][0] = "logical, thinking, questioning";
        questionnaire[2][1] = "empathetic, feeling, accommodating";
        questionnaire[3][0] = "organized, orderly";
        questionnaire[3][1] = "flexible, adaptable";
        questionnaire[4][0] = "more outgoing, think out loud";
        questionnaire[4][1] = "more reserved, think to yourself";
        questionnaire[5][0] = "practical, realistic, experiential";
        questionnaire[5][1] = "imaginative, innovative, theoretical";
        questionnaire[6][0] = "candid, straight forward, frank";
        questionnaire[6][1] = "tactful, kind, encouraging";
        questionnaire[7][0] = "plan, schedule";
        questionnaire[7][1] = "unplanned, spontaneous";
        questionnaire[8][0] = "seek many tasks, public activities, interaction with others";
        questionnaire[8][1] = "seek private, solitary activities with quiet to concentrate";
        questionnaire[9][0] = "standard, usual, conventional";
        questionnaire[9][1] = "different, novel, unique";
        questionnaire[10][0] = "firm, tend to criticize, hold the line";
        questionnaire[10][1] = "gentle, tend to appreciate, conciliate";
        questionnaire[11][0] = "regulated, structured”";
        questionnaire[11][1] = "easygoing, “live” and “let live”";
        questionnaire[12][0] = "external, communicative, express yourself";
        questionnaire[12][1] = "internal, reticent, keep to yourself";
        questionnaire[13][0] = "focus on here-and-now";
        questionnaire[13][1] = "look to the future, global perspective, \"big picture\"";
        questionnaire[14][0] = "tough-minded, just";
        questionnaire[14][1] = "tender-hearted, merciful";
        questionnaire[16][0] = "active, initiate";
        questionnaire[16][1] = "reflective, deliberate";
        questionnaire[15][0] = "preparation, plan ahead";
        questionnaire[15][1] = "go with the flow, adapt as you go";
        questionnaire[17][0] = "facts, things, \"what is\"";
        questionnaire[17][1] = "ideas, dreams, \"what could be,\" philosophical";
        questionnaire[18][0] = "matter of fact, issue-oriented";
        questionnaire[18][1] = "sensitive, people-oriented, compassionate";
        questionnaire[19][0] = "control, govern";
        questionnaire[19][1] = "latitude, freedom";

        int[] answers = new int[20];
        String option;

        for (int i = 0; i < questionnaire.length; i++) {
            System.out.printf("Question %d%n", i+1);
            System.out.println("A. " + questionnaire[i][0]);
            System.out.println("B. " + questionnaire[i][1]);
            System.out.println("Pick an option: A or B");
            option = getOption(scanner);
            if (option.equalsIgnoreCase("A")) answers[i] = 1;

        }

        String[][] personality = {{"E", "I"}, {"S", "N"}, {"T", "F"}, {"J", "P"}};
        int[][] optionsCount = new int[4][2];
        StringBuilder personalityType = new StringBuilder();

        for (int i = 0; i < answers.length/5; i++) {
            int total = 0;
            for (int j = 0; j < answers.length; j+=4) {
                total += answers[j];
            }
            optionsCount[i][0] = total;
            optionsCount[i][1] = 5 - total;
            if(total >= 3){
                personalityType.append(personality[i][0]);
            }else{
                personalityType.append(personality[i][1]);
            }
        }

        System.out.println("\nYour choice at a glance\n");
        System.out.printf("|%5s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s |%n", " ", "A", "B",
                " ", "A", "B", " ", "A", "B", " ", "A", "B");
        System.out.printf("%s%n", "-".repeat(74));

        for (int i = 0; i < answers.length; i += 4) {
            System.out.printf("|%5d | %3s | %3s | %3d | %3s | %3s | %3d | %3s | %3s | %3d | %3s | %3s |%n", i+1, placeCheckmark(answers[i], 1), placeCheckmark(answers[i], 2),
                    i+2, placeCheckmark(answers[i+1], 1), placeCheckmark(answers[i+1], 2), i+3,
                    placeCheckmark(answers[i+2], 1), placeCheckmark(answers[i+2], 2), i+4,
                    placeCheckmark(answers[i+3], 1), placeCheckmark(answers[i+3], 2));
        }
        System.out.printf("%s%n", "-".repeat(74));
        System.out.printf("|%5s | %3d | %3d | %3s | %3d | %3d | %3s | %3d | %3d | %3s | %3d | %3d |%n", "TOTAL", optionsCount[0][0], optionsCount[0][1],
                " ", optionsCount[1][0], optionsCount[1][1], " ", optionsCount[2][0], optionsCount[2][1], " ", optionsCount[3][0], optionsCount[3][1]);
        System.out.printf("%s%n", "-".repeat(74));
        System.out.printf("|%5s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s |%n", " ", "E", "I",
                " ", "S", "N", " ", "T", "F", " ", "J", "P");

        System.out.println("\nYour personality type is " + personalityType);
        System.out.print("For your personality interpretation, visit : ");
        System.out.println("https://www.truity.com/page/16-personality-types-myers-briggs");
    }



    public static String placeCheckmark(int num, int position){
        return (num == 1 && position == 1) || (num == 0 && position == 2) ? String.format("%c", '\u2713') : "";
    }

    public static String getOptionAOrB(String option){
        if(option.equalsIgnoreCase("A") || option.equalsIgnoreCase("B")){
            return option;
        }else {
            throw new IllegalArgumentException("Wrong choice; choose A or B");
        }
    }
    public static String getOption(Scanner scanner){
        String option;
        while (true){
            try {
                option = getOptionAOrB(scanner.nextLine());
                return option;
            }catch (IllegalArgumentException ex){
                System.err.println(ex.getMessage());
            }

        }
    }
}