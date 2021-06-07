package africa.semicolon.ch2;

import java.util.Scanner;

public class TemperatureConverter{

    public static void main(String... args){
        
        double degreeCelsius;
        double degreeFarenheit;

        
        Scanner userInput = new Scanner(System.in);
        System.out.print("Provide temperature in degree Celsius:  ");
        degreeCelsius = userInput.nextDouble();
        
        degreeFarenheit = (((9.0 / 5.0) * degreeCelsius)+ 32);

        
        System.out.printf("%.1f degree Celsius is equivalent to %.1f degree Farenheit%n", degreeCelsius, degreeFarenheit);
        
    }

}
