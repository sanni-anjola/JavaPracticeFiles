package africa.semicolon.chapterFiveExercises;

import java.util.Scanner;

public class TwelveDaysOfChristmasApp {
    public static void main(String[] args) {
        TwelveDaysOfChristmas sing = new TwelveDaysOfChristmas();
        int counter = 1;

        while (counter <= 12){
            System.out.println(sing.sing(counter));
            System.out.println();
            counter++;
        }
    }
}
