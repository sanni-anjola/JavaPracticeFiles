package africa.semicolon.ch2;

import java.util.Scanner;

public class CarPoolSavingsCalculator{
    public static void main(String... args){
        int totalMilesPerDay;
        int costPerGallonOfGasoline;
        int averageMilesPerGallon;
        int parkingFeesPerDay;
        int tollsPerDay;
        int costPerDay;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many miles do you cover in a day: ");
        totalMilesPerDay = input.nextInt();
        System.out.print("What's the cost of a gallon of gasoline in $: ");
        costPerGallonOfGasoline = input.nextInt();
        System.out.print("What is the average miles per gallon: ");
        averageMilesPerGallon = input.nextInt();
        System.out.print("How much is your daily parking fee: ");
        parkingFeesPerDay = input.nextInt();
        System.out.print("How much do you pay for toll?: ");
        tollsPerDay = input.nextInt();
        
        costPerDay = totalMilesPerDay / averageMilesPerGallon * costPerGallonOfGasoline + parkingFeesPerDay + tollsPerDay;
        
        System.out.printf("Wow! you spend about $%d daily just to drive to work.%n", costPerDay);
        System.out.println("Why not try Carpooling to save cost");
    }
}
