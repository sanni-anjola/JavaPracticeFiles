package africa.semicolon.ch2;

import java.util.Scanner;

public class BodyMassIndexCalculator{
    public static void main(String... args){
        
        Scanner input = new Scanner(System.in);
        
        int weight;
        int height;
        int bmi;
        
        System.out.println("BMI VALUES:");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 or greater");
        
        System.out.println("*************************************\n");
        
        System.out.print("To know your Body Mass Index, state your weight and height\n");
        System.out.print("Weight in Kilograms: ");
        weight = input.nextInt();
        System.out.print("Height in metres: ");
        height = input.nextInt();
        
        bmi = weight / (height * height);
        
        System.out.printf("Your BMI Value is: %d%n", bmi);
    }
}
