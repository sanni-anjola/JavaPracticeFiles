package africa.semicolon.chapterFiveExercises;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coefficient of x squared: ");
        double xSquaredCoefficient = scanner.nextDouble();

        System.out.print("Enter the coefficient of x : ");
        double xCoefficient = scanner.nextDouble();

        System.out.print("Enter the constant term: ");
        double constant = scanner.nextDouble();

        if (xSquaredCoefficient == 0) {
            System.out.println("Oops, this is not a quadratic equation");
        } else {
            double discriminant = (xCoefficient * xCoefficient) - (4 * xSquaredCoefficient * constant);
            double root1;
            double root2;
            if (discriminant == 0) {
                root1 = (-1 * xCoefficient) / (2 * xSquaredCoefficient);
                System.out.println("The solution has equal root");
                System.out.printf("The root of the equation is %.2f twice", root1);
            }else if(discriminant > 0){
                root1 = ((-1 * xCoefficient) + Math.sqrt(discriminant))/ (2 * xSquaredCoefficient);
                root2 = ((-1 * xCoefficient) - Math.sqrt(discriminant))/ (2 * xSquaredCoefficient);

                System.out.printf("The root of the equations are: %.2f and %.2f", root1, root2);
            }else {
                System.out.println("The equation has no roots");
            }

        }
    }
}
