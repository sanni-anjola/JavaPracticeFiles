package africa.semicolon.chapterThreeExercises;

import java.util.Scanner;

public class AirConditionerApplication {
    public static void main(String[] args) {
        String prompt = """                
                -> Enter 1 to power on/off the AC
                -> Enter 2 to Increase temperature
                -> Enter 3 to decrease temperature
                -> Enter 4 to exit
                """;

        Scanner scanner = new Scanner(System.in);
        int userInput;

        var ac = new AirConditioner("LG");
        do{
            System.out.println(prompt);
            userInput = scanner.nextInt();
            switch (userInput){
                case 1: // Switch on
                    if(!ac.isOn()){
                        System.out.println("Ac is powering on");
                        ac.setOn(true);
                    }else {
                        System.out.println("AC powering off");
                        ac.setOn(false);
                    }
                    break;
                case 2: // Increase temperature
                    if(ac.isOn()) {
                        ac.increaseTemperature();
                        System.out.printf("AC is now on temperature %d\u00B0C", ac.getTemperature());
                    }else {
                        System.out.println("AC is Off, cannot increase temperature");
                    }
                    break;
                case 3: // Decrease temperature
                    if(ac.isOn()) {
                        ac.decreaseTemperature();
                        System.out.printf("AC is now on temperature %d\u00B0C", ac.getTemperature());
                    }else {
                        System.out.println("AC is Off, cannot decrease temperature");
                    }
                    break;
                case 4: // exit app
                    break;
            }
        }while(userInput != 4);
    }
}
