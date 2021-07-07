package africa.semicolon.diary;

import java.util.Scanner;

public class DiaryApplication {
    static Diary diary = new Diary("My wahala");
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        String homePage = """
                1 -> Add new Entry
                2 -> Delete Entry
                3 -> Find Entry by Title
                """;

        System.out.println(homePage);
        int userInput = scanner.nextInt();
        scanner.nextLine();

        switch (userInput){
            case 1:
                System.out.println("Wetin be the entry");
                main();
            case 2:
                main();
            case 3:
                break;
            default:
                System.out.println("Unknown choice");
        }
    }
}
