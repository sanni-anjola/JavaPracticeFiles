public class Circle{
    public static void main(String... args){
        int radius;
        
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print("Enter the radius of the Circle in metres: ");
        radius = input.nextInt();
        
        System.out.printf("The Diameter of the Circle is: %d metres%n", 2 * radius);
        System.out.printf("The Circumference the Circle is: %.2f metres%n", 2 * Math.PI * radius);
        System.out.printf("The Area of the Circle is: %.2f sq. metres%n", Math.PI * radius * radius);
    }
}
