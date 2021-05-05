import java.util.Scanner;

public class WorldPopulationGrowthCalculator{

    public static void main(String... args){
        
        Scanner input = new Scanner(System.in);
        
        double presentWorldPopulation;
        double yearlyGrowthRate;
        
        
        System.out.print("What is the current world population: ");
        presentWorldPopulation = input.nextDouble();
        System.out.print("What is the estimated annual growth rate?: ");
        yearlyGrowthRate = input.nextDouble();
        
        double populationAfterOneYear = presentWorldPopulation * yearlyGrowthRate;
        double populationAfterTwoYears = populationAfterOneYear * yearlyGrowthRate;
        double populationAfterThreeYears = populationAfterTwoYears * yearlyGrowthRate;
        double populationAfterFourYears = populationAfterThreeYears * yearlyGrowthRate;
        double populationAfterFiveYears = populationAfterFourYears * yearlyGrowthRate;
        
        System.out.printf("The world population after 1year will be: %.0f%n", populationAfterOneYear);
        System.out.printf("The world population after 2years will be: %.0f%n", populationAfterTwoYears);
        System.out.printf("The world population after 3years will be: %.0f%n", populationAfterThreeYears);
        System.out.printf("The world population after 4years will be: %.0f%n", populationAfterFourYears);
        System.out.printf("The world population after 5years will be: %.0f%n", populationAfterFiveYears);
        
        
    }
}
