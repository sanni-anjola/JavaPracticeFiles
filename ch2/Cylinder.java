import java.util.Scanner;

public class Cylinder{

    public static void main(String... args){
        
        double radius;
        double length;
        double area;
        double volume;
        
        Scanner userInput = new Scanner(System.in);
        System.out.print("Provide the radius and height of a Cylinder on a line separated with space e.g. 7.5 23.8, then press Enter:  ");
        
        radius = Double.parseDouble(userInput.next());
        length = Double.parseDouble(userInput.next());
        
        area = Math.PI * Math.pow(radius, 2);
        volume = area * length;
  
        System.out.printf("The area of the Cylinder is %.2f%n", area);
        System.out.printf("The volume of the Cylinder is %.2f%n", volume);
        
    }

}
