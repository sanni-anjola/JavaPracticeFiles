package africa.semicolon.chapterFourExercises;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        System.out.print("Enter the employee Hourly Rate: ");
        int hourlyRate = scanner.nextInt();
        System.out.print("Enter the employee number of Hours: ");
        int numberOfHours = scanner.nextInt();

        System.out.println(computeSalary(numberOfHours, hourlyRate, 40));
    }

    public static double computeSalary(int numberOfHours, int hourlyRate, int straightTime){
        final double EXTRA_RATE = 1.5;
        if(numberOfHours > straightTime) {
            return (hourlyRate * straightTime) + (EXTRA_RATE * hourlyRate * (numberOfHours - straightTime));
        }
        return hourlyRate * straightTime;
    }
}
