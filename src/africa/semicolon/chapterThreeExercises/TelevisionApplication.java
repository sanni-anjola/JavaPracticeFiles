package africa.semicolon.chapterThreeExercises;

import java.util.Scanner;

public class TelevisionApplication {
    public static void main(String[] args) {
        String prompt = """                
                -> Enter 1 to power on/off the TV
                -> Enter 2 to set channel
                -> Enter 3 to change Channel Up
                -> Enter 4 to change Channel Down
                -> Enter 5 to set Volume
                -> Enter 6 to increase Volume
                -> Enter 7 to decrease Volume
                -> Enter 8 to exit
                """;

        Scanner scanner = new Scanner(System.in);
        int userInput;

        var tv = new Television("LG");

        do {
            System.out.println(prompt);
            userInput = scanner.nextInt();
            switch (userInput) {
                case 1: // Switch on/off
                    if (!tv.isOn()) {
                        System.out.println("TV is powering on");
                        tv.setOn(true);
                    } else {
                        System.out.println("TV powering off");
                        tv.setOn(false);
                    }
                    break;
                case 2: // set channel
                    if (tv.isOn()) {
                        System.out.print("Enter channel choice: ");
                        userInput = scanner.nextInt();
                        tv.setChannel(userInput);
                        System.out.printf("Tv is now on channel %d%n", tv.getChannel());
                    } else {
                        System.out.println("TV is Off, cannot change");
                    }
                    break;
                case 3: // channel up
                    if (tv.isOn()) {
                        tv.changeChannelAscend();
                        System.out.printf("Tv is now on channel %d%n", tv.getChannel());
                    } else {
                        System.out.println("TV is Off, cannot change Channel");
                    }
                    break;
                case 4: // Channel Down
                    if (tv.isOn()) {
                        tv.changeChannelDescend();
                        System.out.printf("Tv is now on channel %d%n", tv.getChannel());
                    } else {
                        System.out.println("TV is Off, cannot change channel");
                    }
                    break;
                case 5: // set volume
                    if (tv.isOn()) {
                        System.out.println("Volume can be set between 1 - 100");
                        System.out.print("Enter volume choice: ");
                        userInput = scanner.nextInt();
                        tv.setVolume(userInput);
                        System.out.printf("Tv is now on volume %d%n", tv.getVolume());
                    } else {
                        System.out.println("TV is Off, cannot change Volume");
                    }
                    break;
                case 6: // increase volume
                    if (tv.isOn()) {
                        tv.increaseVolume();
                        System.out.printf("Tv is now on channel %d%n", tv.getVolume());
                    } else {
                        System.out.println("TV is Off, cannot change Volume");
                    }
                    break;
                case 7: // Decrease volume
                    if (tv.isOn()) {
                        tv.decreaseVolume();
                        System.out.printf("Tv is now on channel %d%n", tv.getVolume());
                    } else {
                        System.out.println("TV is Off, cannot change volume");
                    }
                    break;
                case 8: // exit app
                    break;
            }
        } while (userInput != 8);
    }
}
